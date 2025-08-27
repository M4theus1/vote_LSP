package br.com.voting.vote.handler;

import br.com.voting.vote.exception.ExceptionDetails;
import br.com.voting.vote.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ExceptionDetails> handleApiException(ApiException exception) {
        ExceptionDetails details = ExceptionDetails.fromException(exception);

        return ResponseEntity
                .status(exception.getStatus())
                .body(details);
    }
}
