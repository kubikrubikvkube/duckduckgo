package exception;

public class DuckDuckGoClientException extends RuntimeException {
    public DuckDuckGoClientException() {
        super();
    }

    public DuckDuckGoClientException(String message) {
        super(message);
    }

    public DuckDuckGoClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuckDuckGoClientException(Throwable cause) {
        super(cause);
    }

    protected DuckDuckGoClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
