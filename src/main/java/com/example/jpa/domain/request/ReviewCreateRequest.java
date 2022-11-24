package com.example.jpa.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReviewCreateRequest {
    private Integer hospitalId;
    private String title;
    private String content;
    private String userName;
}


