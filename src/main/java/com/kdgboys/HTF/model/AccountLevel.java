package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public enum AccountLevel {
    STANDARD, SILVER, GOLD, PLATINUM;
}
