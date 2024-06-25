package com.project.questappbackend.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCreateRequest {
    Long id;
    String text;
    String title;
    Long userId;
}
