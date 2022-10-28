package com.integrifytask.bookmarkingproject.Repository;

import com.integrifytask.bookmarkingproject.Model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    void deleteBookmarkById(Long id);

    Optional<Bookmark> findBookmarkById(Long id);
    //Boolean checkExistingUrl (String url);
}
