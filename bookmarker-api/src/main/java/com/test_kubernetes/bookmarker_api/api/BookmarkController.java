package com.test_kubernetes.bookmarker_api.api;

import com.test_kubernetes.bookmarker_api.domain.BookmarkDto;
import com.test_kubernetes.bookmarker_api.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookmark")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping("/all")
    public ResponseEntity<List<BookmarkDto>> getAllBookmarks(){
        List<BookmarkDto> result = bookmarkService.getBookmarks();

        return ResponseEntity.ok(result);
    }
}
