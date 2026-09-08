package com.test_kubernetes.bookmarker_api.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final BookmarkMapper bookmarkMapper;

    @Transactional(readOnly = true)
    public BookmarksDto getBookmarks(int pageNo) {
        int pageNum = pageNo < 1 ? 0 : pageNo - 1;
        Pageable pageable = PageRequest.of(pageNum, 10, Sort.Direction.DESC, "createdAt");
        return new BookmarksDto(
                bookmarkRepository
                        .findBookmarks(pageable)
        );
    }
}
