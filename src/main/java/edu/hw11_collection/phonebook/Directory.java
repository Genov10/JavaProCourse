package edu.hw11_collection.phonebook;

import java.util.ArrayList;
import java.util.List;

public class  Directory {
    private List<Note> notes;

    public Directory() {
        notes = new ArrayList<>();
    }

    public void add(Note note) {
        if (userExist(note.getName(), note.getPhoneNumber())) {
            notes.add(note);
        }
    }

    private boolean userExist (String name, String phoneNumber) {
        for (Note note : notes) {
            if (note.getName().equals(name) && note.getPhoneNumber().equals(phoneNumber)) {
                return false;
            }
        }
        return true;
    }

    public Note find(String name) {
        for (Note note : notes) {
            if (note.getName().equals(name)) {
                return note;
            }
        }
        return null;
    }

    public List<Note> findAll(String name) {
        List<Note> allRec = new ArrayList<>();
        for (Note note : notes) {
            if (note.getName().equals(name)) {
                allRec.add(note);
            }
        }
        return allRec;
    }
}
