package com.dfn.todoapp.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue
    @Column(name = "todo_id", nullable = false)
    private Long todoId;
    private String title;
    private String description;
    private Boolean important;
    private Short status;

    @Basic(optional = false)
    @Column(name = "remind_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date remind_at;

    @CreationTimestamp
    private Date created_at;

    @ManyToOne(targetEntity = Category.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_fk",referencedColumnName = "cat_id")
    Category todoCategory;


}
