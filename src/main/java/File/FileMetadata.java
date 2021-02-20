package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class FileMetadata {
    private final String fileName;
    private final String fileSize;
    private final String fileCreationDataTime;

    public FileMetadata(String path) {

        File file = new File(path);

        this.fileName = file.getName();
        this.fileSize = String.format( "%.2f kB",(double) file.length() / 1024 );

        this.fileCreationDataTime = setCreationDateTime(path);
    }

    private String setCreationDateTime(String path){
        BasicFileAttributes attr;
        try {
            attr = Files.readAttributes(Path.of(path), BasicFileAttributes.class);
        } catch (IOException e) {
            System.out.println("Input error");
            e.printStackTrace();
            return "null";
        }

        LocalDateTime localDateTime = attr.creationTime()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return localDateTime.format(format);
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
