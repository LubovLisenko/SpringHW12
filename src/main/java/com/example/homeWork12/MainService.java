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
         noteService.addNote(new Note(0, "Title1", "Content1"));
         noteService.addNote(new Note(1, "Title3", "Content3"));
         noteService.addNote(new Note(2, "Title4", "Content4"));

        long id = noteService.noteList.get(2).getId();
        noteService.getById(id);

         Note note = new Note(id, "Title2", "Content2");
         noteService.update(note);
         noteService.deleteById(id);
         noteService.listAll();
     }

     @PreDestroy
    public void destroy(){
         System.out.println("finish");
     }

}
