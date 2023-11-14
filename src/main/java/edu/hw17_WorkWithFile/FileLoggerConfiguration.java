package edu.hw17_WorkWithFile;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class FileLoggerConfiguration {
    private String url;
    private LoggerLevel loggerLevel;
    private int maxSize;
    private String format;

}
