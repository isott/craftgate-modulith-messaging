package io.craftgate.modulith.messaging.test.integration.sample.rollbackchained.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RollbackChainedRestExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleException(Exception exception){
        return new ResponseEntity<>(exception, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
