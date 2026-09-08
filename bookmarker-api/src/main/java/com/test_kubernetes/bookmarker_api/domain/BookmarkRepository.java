package com.test_kubernetes.bookmarker_api.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query(
            """
            SELECT new com.test_kubernetes.bookmarker_api.domain.BookmarkDto(
                        B.id,
                        B.title,
                        B.url,
                        B.createdAt
                        )
            FROM Bookmark B
            """
    )
    Page<BookmarkDto> findBookmarks(Pageable pageable);
}
