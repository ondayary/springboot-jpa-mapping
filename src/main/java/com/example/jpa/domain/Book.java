package com.example.jpa.domain;


import com.example.jpa.domain.response.BookResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    private Long id;
    private String name;
    // private Long authorId; 이 줄 삭제
    // book에 author를 가져와서 authorId 필요없다.


    // ManyToOne 단방향 Mapping
    // Book에만 Mapping이 있고 Author에는 없기 때문
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
