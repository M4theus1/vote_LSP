package br.com.voting.vote.exception;

import java.time.LocalDateTime;

public class ExceptionDetails {
    private final String title;
    private final int status;
    private final String details;
    private final String developerMessage;
    private final LocalDateTime timestamp;

    public ExceptionDetails(String title, int status, String details, String developerMessage, LocalDateTime timestamp) {
        this.title = title;
        this.status = status;
        this.details = details;
        this.developerMessage = developerMessage;
        this.timestamp = timestamp;
    }

    public static ExceptionDetails fromException(ApiException exception) {
        return new ExceptionDetails(
                exception.getStatus().getReasonPhrase(),
                exception.getStatus().value(),
                exception.getMessage(),
                exception.getClass().getName(),
                LocalDateTime.now()
        );
    }


    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
