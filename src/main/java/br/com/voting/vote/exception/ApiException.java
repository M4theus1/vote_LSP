package br.com.voting.vote.exception;

import java.time.LocalDateTime;

public abstract class ApiException extends RuntimeException {
    private final int status;
    private final LocalDateTime timestamp;

    public ApiException(String message, int status) {
        super(message);
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
