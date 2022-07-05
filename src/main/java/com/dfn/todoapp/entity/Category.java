package com.dfn.todoapp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category {
    @Id
//    @GeneratedValue
    @Column(name = "cat_id", nullable = false)
    private Long catId;
    private String catName;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "todoCategory")
//    private List<Todo> todos;
}
