package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.notebook;

public class notebookController {

	@PostMapping("/save")
	public notebook saveItem(@RequestBody notebook notebook)
	{
		
		return null;
	}
	
	@GetMapping("/get/{id}")
	public notebook getItem(@PathVariable("id") Long id)
	{
		return null;
	}
	
	@PutMapping("/update")
	public notebook updateItem(@RequestBody notebook notebook)
	{
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable("id") Long id)
	{
		
	}
	
	@GetMapping("/getAll")
	public List<notebook> getAllItem()
	{
		return null;
	}
}
