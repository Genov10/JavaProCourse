package edu.hw12_dictionaries;

import edu.hw12_dictionaries.myExaptions.FileAlreadyExist;
import edu.hw12_dictionaries.myExaptions.UnavailablePath;

import java.io.File;
import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> storage;
    public FileNavigator() {
        this.storage = new HashMap<>();
    }
    public void add(FileData fileData, String path) throws UnavailablePath, FileAlreadyExist {
        final String PATH = fileData.getPATH();
        final String NAME = fileData.getNAME();
        if (path.equals(PATH)) {
            throw new UnavailablePath("Unavalible path for file");
        }
        if (storage.containsKey(path)) {
            storage.put(path, new ArrayList<>());
        }
        if (fileAlreadyExist(fileData)) {
            throw new FileAlreadyExist("Unavalible name of file, that name already exist");
        }
        storage.get(path).add(fileData);
    }

    public boolean fileAlreadyExist(FileData fileData) {
        return storage.getOrDefault(fileData.getPATH(), Collections.emptyList()).stream().anyMatch(someFile -> someFile.getNAME().equals(fileData.getNAME()));
    }


    public List<FileData> find(String path) {
        List<FileData> findFiles = new ArrayList<>();

        List<FileData> files = storage.get(path);
        if (files != null) {
            findFiles.addAll(files);
            if (findFiles.size() > 1) {
                findFiles.sort(Comparator.comparing(FileData::getNAME));
            }
        }
        return findFiles;
    }

    public void remove(String path) {
        storage.remove(path);
        System.out.println("Folder was clean");
    }

    public List<FileData> filterBySize (int maxSize) {
        List<FileData> selectedFiles = new ArrayList<>();
        if(!storage.isEmpty()) {
            for (List<FileData> fileDataList : storage.values()) {
                if (!storage.isEmpty()) {
                    for (FileData fileData : fileDataList) {
                        if(fileData.getSIZE() <= maxSize) {
                            selectedFiles.add(fileData);
                        }
                    }
                }
            }
        }
        return selectedFiles;
    }

    public List<FileData> sortBySize () {
        List<FileData> sortedList = new ArrayList<>();
        if(!storage.isEmpty()) {
            for (List<FileData> fileDataList : storage.values()) {
                if (!fileDataList.isEmpty()) {
                    sortedList.addAll(fileDataList);
                }
            }
            if (sortedList.size() > 1) {
                sortedList.sort(Comparator.comparingInt(FileData::getSIZE));
            }
        }
        return sortedList;
    }
}
