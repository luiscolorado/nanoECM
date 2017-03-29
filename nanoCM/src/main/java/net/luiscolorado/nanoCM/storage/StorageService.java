/**
 * 
 */
package net.luiscolorado.nanoCM.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Provide capabilities to store and retrieve files 
 * from storage (typically, local file system).
 * 
 * @author Luis Colorado
 *
 */
@Service
public class StorageService {

    private final Path path;

    @Autowired
    public StorageService(StorageProperties properties) {
        this.path = Paths.get(properties.getPath());
    }


    public void store(MultipartFile file) {
        try {
            if (file.isEmpty()) 
                throw new StorageException("Can't accept an empty file: " + file.getOriginalFilename());

            Files.copy(file.getInputStream(), this.path.resolve(file.getOriginalFilename()));
        } catch (IOException e) {
            throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
        }
    }

}
