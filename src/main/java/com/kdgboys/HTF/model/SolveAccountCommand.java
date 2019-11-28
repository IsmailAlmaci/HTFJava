package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class SolveAccountCommand {
    private String answer;

    public SolveAccountCommand(String answer) {
        this.answer = answer;
    }
}
