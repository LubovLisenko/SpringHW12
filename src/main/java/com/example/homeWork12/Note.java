package com.example.homeWork12;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Note {
    private long id;
    private String title;
    private String content;

}
