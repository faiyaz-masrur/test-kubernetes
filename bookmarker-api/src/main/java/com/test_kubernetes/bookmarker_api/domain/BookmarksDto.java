package com.test_kubernetes.bookmarker_api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class BookmarksDto {

    private List<BookmarkDto> data;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    @Getter(AccessLevel.NONE)
    private boolean isFirst;
    @Getter(AccessLevel.NONE)
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public BookmarksDto(Page<BookmarkDto> bookmarkDtoPage){
        this.setData(bookmarkDtoPage.getContent());
        this.setTotalElements(bookmarkDtoPage.getTotalElements());
        this.setTotalPages(bookmarkDtoPage.getTotalPages());
        this.setCurrentPage(bookmarkDtoPage.getNumber() + 1);
        this.setFirst(bookmarkDtoPage.isFirst());
        this.setLast(bookmarkDtoPage.isLast());
        this.setHasNext(bookmarkDtoPage.hasNext());
        this.setHasPrevious(bookmarkDtoPage.hasPrevious());
    }

    @JsonProperty("isFirst")
    public boolean isFirst() {
        return isFirst;
    }

    @JsonProperty("isLast")
    public boolean isLast() {
        return isLast;
    }

}
