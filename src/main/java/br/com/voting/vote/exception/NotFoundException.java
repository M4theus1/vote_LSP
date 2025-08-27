package br.com.voting.vote.exception;

public class NotFoundException extends ApiException {
    public NotFoundException(String message) {
        super(message, 404);
    }
}
