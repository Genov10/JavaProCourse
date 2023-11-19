package edu.hw21_testing.DS;

public interface DataStore {
    void  addData(String newData);

    String getData(int index);

    void delete (int index);
}
