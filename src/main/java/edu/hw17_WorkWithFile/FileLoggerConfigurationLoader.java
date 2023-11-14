package edu.hw17_WorkWithFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;


public class FileLoggerConfigurationLoader {
    public static final String LOGGER_FILE = "./src/java/edu/hw17_WorkWithFile/logger.txt";
    private final Properties properties = new Properties();
    private File file;

    public FileLoggerConfigurationLoader(String name) {
    this(new File(name));
    }

    public FileLoggerConfigurationLoader(File file) {
        this.file = file;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            try (InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.defaultCharset())){
                properties.load(inputStreamReader);
            }
        }
        catch (Exception e) {
            System.out.println("[" + file.getName() + "] There was an error loading config reason: " + e.getMessage());
        }
    }

    public static FileLoggerConfigurationLoader load() {
        return new FileLoggerConfigurationLoader(new File(LOGGER_FILE));
    }

    private String getValue(String key) {
        final String value = properties.getProperty(key);
        return value != null ? value.trim() : null;
    }

    public int getInt(String key, int defaultValue) {
        final String value = getValue(key);
        if (value == null) {
            System.out.println("[" + file.getName() + "] missing property for key: " + key + " using default value: " + defaultValue);
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("[" + file.getName() + "] Invalid value specified for key: " + key + " specified value: " + value + " should be \"int\" using default value: " + defaultValue);
            return defaultValue;
        }
    }

    public String getString(String key, String defaultValue) {
        final String value = getValue(key);
        if (value == null) {
            System.out.println("[" + file.getName() + "] missing property for key: " + key + " using default value: " + defaultValue);
            return defaultValue;
        }
        return value;
    }

    public <T extends Enum<T>> T getEnum(String key, Class<T> clazz, T defaultValue) {
        final String value = getValue(key);
        if (value == null) {
            System.out.println("[" + file.getName() + "] missing property for key: " + key + " using default value: " + defaultValue);
            return defaultValue;
        }

        try {
            return Enum.valueOf(clazz, value);
        } catch (IllegalArgumentException e) {
            System.out.println("[" + file.getName() + "] Invalid value specified for key: " + key + " specified value: " + value + " should be enum value of \"" + clazz.getSimpleName() + "\" using default value: " + defaultValue);
            return defaultValue;
        }
    }
}
