package com.kdgboys.HTF.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Pageable {
    private long offset;
    private int pageNumber;
    private int pageSize;
    private boolean paged;
    private Sort sort;
    private boolean unpaged;
}
