package Directory;

import File.FileMetadata;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Directory {
    private final String path;

    public Directory(String path) {
        this.path = path;
    }

    public boolean isDirectory(){
        return Files.isDirectory(Path.of(path));
    }

    public String getPath() {
        return path;
    }

    public String[] getFilesFromDirectory(){
        File f = new File(path);
        return f.list();
    }

    public List<FileMetadata> getFilesMetadataListFromDirectory(){
        String[] filesNames = getFilesFromDirectory();
        List<FileMetadata> filesMetadata = new ArrayList<>();

        for (String name : filesNames){
            filesMetadata.add(new FileMetadata(path + "\\" + name));
        }

        return filesMetadata;
    }
}
