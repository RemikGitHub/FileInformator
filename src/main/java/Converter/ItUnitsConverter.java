package Converter;

public class ItUnitsConverter {

    public static String dynamicSizeConverter (Double size){

        if (size < 1000.0) return String.format( "%.2f B", size);

        size /= 1024.0;
        if (size < 1000.0) return String.format( "%.2f KB", size);

        size /= 1024.0;
        if (size < 1000.0) return String.format( "%.2f MB", size);

        size /= 1024.0;
        if (size < 1000.0) return String.format( "%.2f GB", size);

        size /= 1024.0;
        return String.format( "%.2f TB", size);
    }

}
