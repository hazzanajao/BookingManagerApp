package com.integrifytask.bookmarkingproject.Model;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name="folderBean")
public class Folder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, description, createDate, updatedDate;

    @Column(nullable = false, updatable = false)
    private String folderCode;

    @OneToMany( mappedBy = "folders", cascade = CascadeType.ALL )
    private List<Bookmark> bookmarks;

    public Folder (){}
    public Folder (String name, String description, String createDate, String updatedDate){
        super();
        this.name = name;
        this.description = description;
        this.createDate = createDate;
        this.updatedDate = updatedDate;

    }
}
