package com.securefintechbank.SecureFintechBank.exceptions;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }
}

