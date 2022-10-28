package com.integrifytask.bookmarkingproject;

import com.integrifytask.bookmarkingproject.Model.Bookmark;
import com.integrifytask.bookmarkingproject.Model.Folder;
import com.integrifytask.bookmarkingproject.Repository.BookmarkRepository;
import com.integrifytask.bookmarkingproject.Repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class
BookmarkingprojectApplication {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Autowired
    private FolderRepository folderRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookmarkingprojectApplication.class, args);

        System.out.println("Springboot Compiled Successfully!!");

    }

    @Bean
    CommandLineRunner runner(){
        return args -> {

            /* Passing json data into bookmarkObject*/

         Bookmark bookmark = new Bookmark(
                    "Typscript Programming",
                    "www.typescriptprogramming.com",
                    "25/10/2020",
                    "25/10/2022",
                    "bookmarkCode-1"
            );
            bookmarkRepository.save(bookmark);

            bookmark = new Bookmark(
                    "Javascript Programming",
                    "www.javascriptprogramming.com",
                    "25/10/2020",
                    "25/10/2022",
                    "bookmarkCode-2"
            );
            bookmarkRepository.save(bookmark);

            bookmark = new Bookmark(
                    "C# Programming",
                    "www.c#programming.com",
                    "25/10/2020",
                    "25/10/2022",
                    "bookmarkCode-3"
            );
            bookmarkRepository.save(bookmark);

            bookmark = new Bookmark(
                    "Python Programming",
                    "www.pythonprogramming.com",
                    "25/10/2020",
                    "25/10/2022",
                    "bookmarkCode-4"
            );
            bookmarkRepository.save(bookmark);

            bookmark = new Bookmark(
                    "Nodejs Programming",
                    "www.nodejsprogramming.com",
                    "25/10/2020",
                    "25/10/2022",
                    "bookmarkCode-5"
            );
            bookmarkRepository.save(bookmark);

            /* Passing json data into folderObject new to be reviewed*/

            /* Folder folder = new Folder(
                    "Typscript Programming",
                    "This is a superscript of javascript, developed for building modern web application",
                    "25/10/2020",
                    "25/10/2022"
            );
            folderRepository.save(folder);

           folder = new Folder(
                    "Javascript Programming",
                    "This is best programming language for any web application ",
                    "25/10/2020",
                    "25/10/2022"
            );

            folder = new Folder(
                    "C# Programming",
                    "This is an object oriented programing language for web application",
                    "25/10/2020",
                    "25/10/2022"
            );

            folder = new Folder(
                    "Python Programming",
                    "This is a programing language for developing web applications, data analysis etc.",
                    "25/10/2020",
                    "25/10/2022"
            );

            folder = new Folder(
                    "Nodejs Programming",
                    "This is an important open source backend javascript runtime environment, essentially for " +
                            "backend development",
                    "25/10/2020",
                    "25/10/2022"
            );*/

        };
    }
}
