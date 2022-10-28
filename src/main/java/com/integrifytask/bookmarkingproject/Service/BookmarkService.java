package com.integrifytask.bookmarkingproject.Service;

import com.integrifytask.bookmarkingproject.Exception.BookmarkNotFoundException;
import com.integrifytask.bookmarkingproject.Model.Bookmark;
import com.integrifytask.bookmarkingproject.Repository.BookmarkRepository;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    @Autowired
    public BookmarkService(BookmarkRepository bookmarkRepository){
        this.bookmarkRepository = bookmarkRepository;
    }

    public Bookmark addBookmark(Bookmark bookmark){
        bookmark.setBookmarkCode(UUID.randomUUID().toString());
        return bookmarkRepository.save(bookmark);
    }


    public List<Bookmark> findAllBookmarks(){
        return bookmarkRepository.findAll();
    }

    public Bookmark updateBookmark(Bookmark bookmark){
        return bookmarkRepository.save(bookmark);
    }

    public Bookmark findBookmarkById(Long id){
        return bookmarkRepository.findBookmarkById(id)
                .orElseThrow(() -> new BookmarkNotFoundException("Bookmark By Id" + id + "Was Not Found"));
    }

    public void deleteBookmark( Long id){
        bookmarkRepository.deleteBookmarkById(id);
    }

}
