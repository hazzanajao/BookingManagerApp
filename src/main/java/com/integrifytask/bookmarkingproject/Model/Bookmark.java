package com.integrifytask.bookmarkingproject.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;



@Data
@Entity
@Table(name = "bookmarkBean")
public class Bookmark implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name, url, createDate, updatedDate;

    @Column(nullable = false, updatable = false)
    private String bookmarkCode;

   @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "folders_id", referencedColumnName = "id")
    private Folder folders;

    public Bookmark(){}
    public Bookmark(String name, String url, String createDate, String updatedDate, String bookmarkCode){
        super();
        this.name = name;
        this.url = url;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.bookmarkCode = bookmarkCode;
    }

}
