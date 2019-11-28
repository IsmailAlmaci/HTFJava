package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Page<T> {
    private T content;
    private boolean empty;
    private boolean first;
    private boolean last;
    private int number;
    private int numberOfElements;
    private Pageable pagable;
    private int size;
    private Sort sort;
    private long totalElements;
    private int totalPages;
}
