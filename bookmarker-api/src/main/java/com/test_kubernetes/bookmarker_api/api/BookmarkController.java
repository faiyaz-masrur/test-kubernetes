package com.test_kubernetes.bookmarker_api.api;

import com.test_kubernetes.bookmarker_api.domain.BookmarkDto;
import com.test_kubernetes.bookmarker_api.domain.BookmarkService;
import com.test_kubernetes.bookmarker_api.domain.BookmarksDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookmark")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping("/all")
    public ResponseEntity<BookmarksDto> getBookmarks(
            @RequestParam(name = "page", defaultValue = "1")
            Integer pageNo
    ){
        return ResponseEntity.ok(bookmarkService.getBookmarks(pageNo));
    }
}
