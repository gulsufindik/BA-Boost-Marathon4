package com.gulsufindik.exception;

import lombok.Getter;

@Getter
public class SkorYonetimiServiceException extends RuntimeException{
    private final EerrorType type;

    public SkorYonetimiServiceException(EerrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public SkorYonetimiServiceException(EerrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
