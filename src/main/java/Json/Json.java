package Json;

import File.FileMetadata;
import java.io.File;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.util.List;

public class Json {

    public static void fileMetadataToJson(String path, List<FileMetadata> filesMetadata){

        try {
            ObjectMapper mapper = new ObjectMapper();
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
            writer.writeValue(new File(path + "\\files.json"), filesMetadata);
        } catch (IOException e) {
            System.out.println("Output error");
            e.printStackTrace();
        }
    }
}
