package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ExternalTransferCommand {
    private int amount;
    private String originAccountAnswer;
    private String destinationAccountAnswer;
}
