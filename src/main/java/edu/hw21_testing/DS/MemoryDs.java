package edu.hw21_testing.DS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MemoryDs implements DataStore {
    private List<String> data = new ArrayList<>();
    @Override
    public void addData(String newData) {
        this.data.add(newData);
    }

    @Override
    public String getData(int index) {
        return data.get(index);
    }

    @Override
    public void delete(int index) {
        this.data.remove(index);
    }

    public List<String> getData() {
        return data;
    }
}
