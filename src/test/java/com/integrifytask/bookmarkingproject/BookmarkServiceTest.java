package com.integrifytask.bookmarkingproject;

import com.integrifytask.bookmarkingproject.Model.Bookmark;
import com.integrifytask.bookmarkingproject.Repository.BookmarkRepository;
import com.integrifytask.bookmarkingproject.Service.BookmarkService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

public class BookmarkServiceTest {

    private BookmarkService bookmarkServiceUT;
    private AutoCloseable autoCloseable;

    @Mock
    private BookmarkRepository bookmarkRepository;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        bookmarkServiceUT = new BookmarkService(bookmarkRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void shouldGetAllBookmarks() {
        //when
        bookmarkServiceUT.findAllBookmarks();
        //then
        verify(bookmarkRepository).findAll();

    }

    @Test
    void shouldAddBookmark() {
        //Given
        Bookmark bookmark = new Bookmark
                (
                        "Integrify-Javascript Programming Book",
                        "www.integrifyprogramming.com",
                        "25/10/2020",
                        "25/10/2022",
                        "integrify-Javascript"
                );
        //When
        bookmarkServiceUT.addBookmark(bookmark);

        //Then
        ArgumentCaptor<Bookmark> bookmarkArgumentCaptor =
                ArgumentCaptor.forClass(Bookmark.class);
        verify(bookmarkRepository)
                .save(bookmarkArgumentCaptor.capture());
        Bookmark capturedBookmark = bookmarkArgumentCaptor.getValue();
        assertThat(capturedBookmark).isEqualTo(bookmark);
    }

    @Test
    void deleteBookmark() {
        //Given
        Bookmark bookmark = new Bookmark
                (
                        "Typescript Programming Book",
                        "www.integrifyprogramming.com",
                        "25/10/2020",
                        "25/10/2022",
                        "integrify-Javascript"
                );
        //When
        bookmarkServiceUT.deleteBookmark(bookmark.getId());


    }

}
