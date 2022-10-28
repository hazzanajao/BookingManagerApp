package com.integrifytask.bookmarkingproject.Service;


import com.integrifytask.bookmarkingproject.Exception.FolderNotFoundException;
import com.integrifytask.bookmarkingproject.Model.Folder;
import com.integrifytask.bookmarkingproject.Repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class FolderService {

    private final FolderRepository folderRepository;

    @Autowired
    public FolderService(FolderRepository folderRepository){
        this.folderRepository = folderRepository;
    }

    public Folder addFolder(Folder folder){
        folder.setFolderCode(UUID.randomUUID().toString());
        return folderRepository.save(folder);
    }
    /* Needed for Post method2 from FolderController
    public void addNewFolder(Folder folder) {
        System.out.println(folder);
    }
    */

    public List<Folder> findAllFolders(){
        return folderRepository.findAll();
    }

    public Folder updateFolder(Folder folder){
        return folderRepository.save(folder);
    }

    public Folder findFolderById(Long id){
        return folderRepository.findFolderById(id)
                .orElseThrow(() -> new FolderNotFoundException("Folder By Id" + id + "Was Not Found"));
    }

    public void deleteFolder( Long id){
        folderRepository.deleteFolderById(id);
    }


}
