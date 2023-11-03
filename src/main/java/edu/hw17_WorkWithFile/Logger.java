package edu.hw17_WorkWithFile;

import lombok.Getter;

import java.io.File;
import java.time.LocalDateTime;

public abstract class Logger {
    private FileLoggerConfiguration fileLoggerConfiguration;

    public Logger() {
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader = FileLoggerConfigurationLoader.load();
        String fileName = fileLoggerConfigurationLoader.getString("FILE", "log");
        LoggerLevel loggerLevel = fileLoggerConfigurationLoader.getEnum("LEVEL", LoggerLevel.class, LoggerLevel.INFO);
        int maxSize = fileLoggerConfigurationLoader.getInt("MAX-SIZE", 20000);
        String textFormat = fileLoggerConfigurationLoader.getString("FORMAT",  "[%s][%s] MSG: %s");

        fileLoggerConfiguration = new FileLoggerConfiguration(fileName, loggerLevel, maxSize, textFormat);
    }

    public void debug(String msg) {
        log(String.format(fileLoggerConfiguration.getFormat(), LocalDateTime.now(), LoggerLevel.DEBUG, msg));
    }

    public void info(String msg) {
        log(String.format(fileLoggerConfiguration.getFormat(), LocalDateTime.now(), LoggerLevel.INFO, msg));
    }

    protected String getFolder() {
        return "./src/java/edu/hw17_WorkWithFile/" + getLoggerConfiguration().getPath();
    }

    protected abstract void log(String msg);

}
