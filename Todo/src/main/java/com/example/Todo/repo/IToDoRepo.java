package com.example.Todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Todo.model.*;;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
