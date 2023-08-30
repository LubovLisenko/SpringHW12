package com.example.homeWork12;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


@Service
public class NoteService {

    public List<Note> noteList = new ArrayList<>();


    public int createId() {
        Random random = new Random();
        int number = random.nextInt();
        return number;
    }


    Note addNote(Note note) {
        Note newNode = new Note();
        newNode.setId(createId());
        newNode.setTitle(note.getTitle());
        newNode.setContent(note.getContent());
        noteList.add(newNode);
        return newNode;

    }

    List<Note> listAll() {
        System.out.println("ListAll: ");
        for (Note note : noteList) {
            System.out.println("note = " + note);
        }
        return noteList;
    }

    Note getById(int id) {
        try {
            noteList.get(id);
        } catch (Exception e) {
            System.out.println("Method getById don`t work . Enter right ID");
            return null;
        }
        return noteList.get(id);
    }

    void deleteById(int id) {
        try {
            Note remove = noteList.remove(id);
        } catch (Exception ex) {
            System.out.println("This object isn`t exist. Enter right ID");
        }
    }

    void update(Note note) {

        for (Note i : noteList) {
            if (i.getId() == note.getId()) {
                i.setId(note.getId());
                i.setTitle(note.getTitle());
                i.setContent(note.getContent());
                break;
            }
        }

    }
}


