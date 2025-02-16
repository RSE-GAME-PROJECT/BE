package com.game.core.error.exception;

import com.game.core.error.dto.ErrorMessage;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private final ErrorMessage errorMessage;

    public BusinessException(ErrorMessage message){
        super(message.message());
        this.errorMessage = message;
    }
}