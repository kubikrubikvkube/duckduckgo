package client;

import domain.ApiResponse;
import exception.DuckDuckGoClientException;
import lombok.NonNull;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

import static java.nio.charset.StandardCharsets.UTF_8;

public class DuckDuckGoClient {
    private static final String URL_TEMPLATE = "https://api.duckduckgo.com/?q=%s&format=json&pretty=0&t=test";
    private static final HttpClient httpClient = HttpClient.newHttpClient();

    private final String userAgent;

    public DuckDuckGoClient(@NonNull String userAgent) {
        this.userAgent = userAgent;
    }

    public DuckDuckGoClient() {
        this.userAgent = "com.github.kubikrubikvkube.duckduckgo";
    }

    /**
     * //TODO
     *
     * @param query
     * @return
     * @throws DuckDuckGoClientException
     */
    public ApiResponse sendSync(@NonNull String query) throws DuckDuckGoClientException {
        HttpRequest request = createHttpRequest(query);

        HttpResponse<String> response;
        try {
            response = httpClient.send(request, BodyHandlers.ofString(UTF_8));
        } catch (IOException | InterruptedException ex) {
            throw new DuckDuckGoClientException(ex);
        }
        return ApiResponseConverter.convertToApiResponse(response);
    }

    /**
     * //TODO
     *
     * @param query
     * @return
     * @throws DuckDuckGoClientException
     */
    public CompletableFuture<ApiResponse> sendAsync(@NonNull String query) throws DuckDuckGoClientException {
        HttpRequest request = createHttpRequest(query);

        return httpClient
                .sendAsync(request, BodyHandlers.ofString(UTF_8))
                .thenApply(ApiResponseConverter::convertToApiResponse)
                .exceptionally(ex -> {
                    throw new DuckDuckGoClientException(ex);
                });
    }

    private HttpRequest createHttpRequest(@NonNull String query) {
        String encodedQuery = URLEncoder.encode(query, UTF_8);
        String encodedUrl = String.format(URL_TEMPLATE, encodedQuery);

        return HttpRequest.newBuilder()
                .uri(URI.create(encodedUrl))
                .GET()
                .header("User-Agent", userAgent)
                .build();
    }
}
