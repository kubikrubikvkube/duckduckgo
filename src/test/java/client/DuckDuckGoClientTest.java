package client;

import domain.ApiResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuckDuckGoClientTest {
    private static DuckDuckGoClient client;

    @BeforeAll
    static void beforeAll() {
        client = new DuckDuckGoClient();
    }

    @Test
    void sendSync() {
        ApiResponse duckduckgo = client.sendSync("united states of america");
        assertThat(duckduckgo).isNotNull();
        assertThat(duckduckgo.getAbstractSource()).isEqualTo("Wikipedia");
        assertThat(duckduckgo.getAbstractUrl()).isEqualTo("https://en.wikipedia.org/wiki/The_United_States_of_America_(disambiguation)");
    }

    @Test
    void sendAsync() {
        ApiResponse duckduckgo = client.sendAsync("united states of america").join();
        assertThat(duckduckgo).isNotNull();
        assertThat(duckduckgo.getAbstractSource()).isEqualTo("Wikipedia");
        assertThat(duckduckgo.getAbstractUrl()).isEqualTo("https://en.wikipedia.org/wiki/The_United_States_of_America_(disambiguation)");
    }
}