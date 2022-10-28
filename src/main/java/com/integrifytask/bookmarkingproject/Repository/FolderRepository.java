package com.integrifytask.bookmarkingproject.Repository;

import com.integrifytask.bookmarkingproject.Model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    void deleteFolderById(Long id);
    Optional<Folder> findFolderById(Long id);
}
