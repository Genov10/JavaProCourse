package edu.hw11_collection;

import java.util.*;

public class Methods {
    public void countOccurance(List<String> checkedList, String testedWord) {
        int counter = 0;
        for (String str : checkedList) {
            if (str == testedWord) {
                counter++;
            }
        }
        System.out.println("\"" + testedWord + "\" repeat in list " + counter + " times");
    }
    public static <T> List<T> toList(T[] arr) {
        return Arrays.asList(arr);
    }
    public List<Integer> findUnique(List<Integer> listOfInt) {
        List<Integer> uniqueList = new ArrayList<>();
        Iterator<Integer> iterator = listOfInt.iterator();

        while (iterator.hasNext()) {
            Integer item = iterator.next();
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }
        return uniqueList;
    }

    public void calcOccurance(List<String> list){
        Map<String, Integer> wordAmount = new HashMap<>();
        for (String str : list) {
            wordAmount.put(str, wordAmount.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordAmount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public List<Map<String, Object>> findOccurance(List<String> list) {
        Map<String, Integer> wordAmount = new HashMap<>();
        Map<String, Object> wordInfo = new HashMap<>();
        List<Map<String, Object>> res = new ArrayList<>();
        for (String str : list) {
            wordAmount.put(str, wordAmount.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordAmount.entrySet()) {
            wordInfo.put("name: ", "\"" + entry.getKey() + "\"");
            wordInfo.put( "amount:", entry.getValue());
            res.add(wordInfo);
        }
        return res;
    }
}
