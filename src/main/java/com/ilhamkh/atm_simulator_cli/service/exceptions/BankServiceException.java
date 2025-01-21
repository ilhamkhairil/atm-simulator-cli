package com.ilhamkh.atm_simulator_cli.service.exceptions;

public class BankServiceException extends RuntimeException {
    public BankServiceException(String message) {
        super(message);
    }
    public BankServiceException(Exception e) {
        super(e);
    }
}
