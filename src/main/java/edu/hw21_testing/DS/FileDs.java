package edu.hw21_testing.DS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDs implements DataStore{
    private final File file = new File("data.txt");
    List<String> data = new ArrayList<>();
    @Override
    public void addData(String newString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            for (String str : data) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getData(int index) {
        try(BufferedReader r = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = r.readLine()) !=null ) {
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data.get(index);
    }

    @Override
    public void delete(int index) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
            data.remove(index);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String str : data) {
                    writer.write(str);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
