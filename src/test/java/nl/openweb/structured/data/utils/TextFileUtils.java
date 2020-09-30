package nl.openweb.structured.data.utils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileUtils {
    private TextFileUtils() {
    }

    public static String getFileAsString(String name) throws Exception {
        return getFileAsString(name, TextFileUtils.class.getClassLoader());
    }

    public static String getFileAsString(String name, ClassLoader classLoader) throws Exception {
        return String.join("", Files.readAllLines(Paths.get(classLoader.getResource(name).toURI()), StandardCharsets.UTF_8));
    }
}
