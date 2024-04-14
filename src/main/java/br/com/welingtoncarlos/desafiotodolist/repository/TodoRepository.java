package br.com.welingtoncarlos.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.welingtoncarlos.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
