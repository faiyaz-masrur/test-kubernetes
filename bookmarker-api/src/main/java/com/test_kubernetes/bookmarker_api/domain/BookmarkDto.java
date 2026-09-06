package com.test_kubernetes.bookmarker_api.domain;

import lombok.*;

import java.time.Instant;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkDto {
    private Long id;
    private String title;
    private String url;
    private Instant createdAt;
}
