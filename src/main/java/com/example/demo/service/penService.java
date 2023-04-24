package com.example.demo.service;

import java.util.List;

import com.example.demo.model.pen;

public interface penService {

	pen save(pen pen);

	pen getItem(Long id);

	pen update(pen pen);

	void delete(Long id);

	List<pen> getAll();

}
