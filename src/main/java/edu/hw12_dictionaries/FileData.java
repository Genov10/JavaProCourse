package edu.hw12_dictionaries;

public class FileData {
    private final String NAME;
    private final int SIZE;
    private final String PATH;

    public FileData(String NAME, int SIZE, String PATH) {
        this.NAME = NAME;
        this.SIZE = SIZE;
        this.PATH = PATH;
    }

    public String getNAME() {
        return NAME;
    }

    public int getSIZE() {
        return SIZE;
    }

    public String getPATH() {
        return PATH;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "NAME='" + NAME + '\'' +
                ", SIZE=" + SIZE +
                ", PATH='" + PATH + '\'' +
                '}';
    }
}
