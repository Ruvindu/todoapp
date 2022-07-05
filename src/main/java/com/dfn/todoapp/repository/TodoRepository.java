package com.dfn.todoapp.repository;

import com.dfn.todoapp.entity.Todo;
import com.sun.xml.bind.v2.TODO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

    @Query(value = "SELECT * FROM `todo` WHERE `important`=1",nativeQuery = true)
    List<Todo> getImportantTodos();

    @Query(value = "SELECT * FROM `todo` WHERE `cat_fk`=?1",nativeQuery = true)
    List<Todo> getTodosByCats(Integer cat_id);

    @Modifying
    @Query(value = "UPDATE `todo` SET `important`= ?2 WHERE `todo_id`= ?1",nativeQuery = true)
    @Transactional
    void updateImportant(Long todo_id,Boolean important);

    @Modifying
    @Query(value = "UPDATE `todo` SET `status`= ?2 WHERE `todo_id`= ?1",nativeQuery = true)
    @Transactional
    void updateStatus(Long todo_id,Integer status);

}
