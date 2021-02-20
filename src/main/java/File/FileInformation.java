package File;

import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;

public class FileInformation {
    private final String fileName;
    private final double fileSize;
    private final FileTime fileCreationDataTime;

    public FileInformation(String fileName, double fileSize, FileTime fileCreationDataTime) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileCreationDataTime = fileCreationDataTime;
    }
}
