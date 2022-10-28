package com.integrifytask.bookmarkingproject;

import org.junit.jupiter.api.Test;
import com.integrifytask.bookmarkingproject.Controller.BookmarkController;
import com.integrifytask.bookmarkingproject.Controller.FolderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

/***
 *Performed Unit Testing on the controllers
 ********************************************/
@SpringBootTest
class BookmarkingprojectApplicationTests {
    @Autowired
    private BookmarkController bookmarkController;
    @Autowired
    private FolderController folderController;

    @Test
    void contextLoads() {
        /**
         * Performing AssertThat Testing
         * ***********************************/
        assertThat(bookmarkController).isNotNull();
        assertThat(folderController).isNotNull();
    }

}
