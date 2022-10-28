package com.integrifytask.bookmarkingproject.Controller;

import com.integrifytask.bookmarkingproject.Model.Bookmark;
import com.integrifytask.bookmarkingproject.Model.Folder;
import com.integrifytask.bookmarkingproject.Service.BookmarkService;
import com.integrifytask.bookmarkingproject.Service.FolderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1")
public class FolderController {

    private final FolderService folderService;

    public FolderController(FolderService folderService){

        this.folderService = folderService;
    }

    @GetMapping("/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        List<Folder> folders = folderService.findAllFolders();
        return new ResponseEntity<>(folders, HttpStatus.OK);
    }
     /*Posting Method 1 */
    @PostMapping("/folders")
    public ResponseEntity<Folder> addFolder(@RequestBody Folder folder){
        Folder newFolder = folderService.addFolder(folder);
        return new ResponseEntity<>(newFolder, HttpStatus.CREATED);
    }

     /*Posting Method 2
    @PostMapping("/folders")
    public void postNewFolder(@RequestBody Folder folder) {
        folderService.addNewFolder(folder);
    }*/

    @PutMapping("/folders/{id}")
    public ResponseEntity<Folder> updateFolder(@RequestBody  Folder  folder){
        Folder updateFolder =  folderService.updateFolder(folder);
        return new ResponseEntity<>(updateFolder, HttpStatus.OK);
    }
    @DeleteMapping("/folders/{id}")
    public ResponseEntity<?> deleteFolder(@PathVariable("id") Long id){
        folderService.deleteFolder(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
