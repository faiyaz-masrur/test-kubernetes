package com.test_kubernetes.bookmarker_api.domain;

import jakarta.persistence.Column;
import lombok.*;

import java.time.Instant;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
public class BookmarkDto {

    private Long id;
    private String title;
    private String url;
    private Instant createdAt;

}
