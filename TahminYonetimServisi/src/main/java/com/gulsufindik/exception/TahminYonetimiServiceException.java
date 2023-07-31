package com.gulsufindik.exception;

import lombok.Getter;

@Getter
public class TahminYonetimiServiceException extends RuntimeException{
    private final EerrorType type;

    public TahminYonetimiServiceException(EerrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public TahminYonetimiServiceException(EerrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }
}
