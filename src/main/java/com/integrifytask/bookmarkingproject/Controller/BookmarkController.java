package com.integrifytask.bookmarkingproject.Controller;

import com.integrifytask.bookmarkingproject.Model.Bookmark;
import com.integrifytask.bookmarkingproject.Service.BookmarkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService){

        this.bookmarkService = bookmarkService;
    }

    @GetMapping("/bookmarks")
    public ResponseEntity<List<Bookmark>> getAllBookmarks(){
        List<Bookmark> bookmarks = bookmarkService.findAllBookmarks();
        return new ResponseEntity<>(bookmarks, HttpStatus.OK);
    }

    @GetMapping("/bookmarks/folders/{id}")
    public ResponseEntity<Bookmark> getCompanyById(@PathVariable("id") Long id){
        Bookmark bookmark = bookmarkService.findBookmarkById(id);
        return new ResponseEntity<>(bookmark, HttpStatus.OK);
    }

    @PostMapping("/bookmarks")
    public ResponseEntity<Bookmark> addBookmark(@RequestBody Bookmark bookmark){
        Bookmark newBookmark = bookmarkService.addBookmark(bookmark);
        return new ResponseEntity<>(newBookmark, HttpStatus.CREATED);
    }

    @PutMapping("/bookmarks/{id}")
    public ResponseEntity< Bookmark> updateBookmark(@RequestBody  Bookmark  bookmark){
        Bookmark updateBookmark =  bookmarkService.updateBookmark(bookmark);
        return new ResponseEntity<>(updateBookmark, HttpStatus.OK);
    }
    @DeleteMapping("/bookmarks/{id}")
    public ResponseEntity<?> deleteBookmark(@PathVariable("id") Long id){
        bookmarkService.deleteBookmark(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
