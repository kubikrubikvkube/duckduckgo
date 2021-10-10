package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.ApiResponse;
import lombok.NonNull;
import lombok.SneakyThrows;

import java.net.http.HttpResponse;

/**
 * Converts {@link HttpResponse<String>} from DuckDuckGo API response to {@link ApiResponse} instance
 */
class ApiResponseConverter {
    private static final ObjectMapper objectMapper = createObjectMapper();

    private static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        return objectMapper;
    }


    /**
     * Converts HttpResponse to {@link ApiResponse} instance
     *
     * @param response HttpResponse from DuckDuckGo API
     * @return ApiResponse object
     */
    @SneakyThrows({JsonProcessingException.class})
    static ApiResponse convertToApiResponse(@NonNull HttpResponse<String> response) {
        return objectMapper.readValue(response.body(), ApiResponse.class);
    }

}
