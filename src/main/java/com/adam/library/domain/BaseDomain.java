package com.adam.library.domain;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class BaseDomain {

    private String createdBy;
    private String updatedBy;
    private ZonedDateTime createdOn;
    private ZonedDateTime updatedOn;
}
