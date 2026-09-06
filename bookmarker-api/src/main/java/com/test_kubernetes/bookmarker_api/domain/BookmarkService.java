package com.test_kubernetes.bookmarker_api.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public List<BookmarkDto> getBookmarks() {
        return bookmarkRepository.findAll()
                .stream()
                .map(bookmark -> {
                    return BookmarkDto.builder()
                            .id(bookmark.getId())
                            .title(bookmark.getTitle())
                            .url(bookmark.getUrl())
                            .createdAt(bookmark.getCreatedAt())
                            .build();
                })
                .toList();
    }
}
