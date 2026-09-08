package com.test_kubernetes.bookmarker_api.domain;

import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDto toDto(@NonNull Bookmark bookmark){
        return BookmarkDto.builder()
                .id(bookmark.getId())
                .title(bookmark.getTitle())
                .url(bookmark.getUrl())
                .createdAt(bookmark.getCreatedAt())
                .build();
    }
}
