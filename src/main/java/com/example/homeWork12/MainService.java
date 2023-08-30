package com.example.homeWork12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainService {

    private final NoteService noteService;

     @PostConstruct
     public void init(){
         noteService.addNote(new Note(0,"Title1", "Content1"));
         noteService.update(new Note(0, "Title2", "Content2"));
         noteService.getById(0);
         noteService.listAll();
         noteService.deleteById(0);
         noteService.listAll();

     }

     @PreDestroy
    public void destroy(){
         System.out.println("finish");
     }

}
