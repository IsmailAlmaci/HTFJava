package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.UUID;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountDto {
    private String id;
    private String accountNumber;
    private String name;
    private Type type;
    private String challenge;
    private int amount;
    private AccountLevel accountLevel;
    private String challengeParameters;
}