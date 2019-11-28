package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PersonalizeAccountCommand {
    private String name;
    private String answer;
}
