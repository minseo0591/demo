package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {

    private Long id;
    private String title;
    private String content;
    private String writer;
    private String updateWriter;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private Long count;
    private String password;
    private char status;

}
