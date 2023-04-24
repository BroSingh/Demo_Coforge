package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.notebook;

public interface notebookRepo extends JpaRepository<notebook, Long> {

}
