package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;


public class FileMetadata {
    private final String fileName;
    private final String fileSize;
    private final String fileCreationDataTime;

    public FileMetadata(String path) {

            File file = new File(path);
            BasicFileAttributes attr;

        try {
            attr = Files.readAttributes(Path.of(file.getPath()), BasicFileAttributes.class);
        } catch (IOException e) {
            System.out.println("Input error");
            attr = null;
            e.printStackTrace();
        }

        this.fileName = file.getName();
        this.fileSize = (double) attr.size() / (1024 * 1024) + " MB";
        this.fileCreationDataTime = "" + attr.creationTime();
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getFileCreationDataTime() {
        return fileCreationDataTime;
    }
}
