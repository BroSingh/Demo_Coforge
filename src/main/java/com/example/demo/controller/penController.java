package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.pen;
import com.example.demo.service.penService;

@RestController
@CrossOrigin(origins = "*")
public class penController {

	@Autowired
	private penService penService;
	
	@PostMapping("/save")
	public pen saveItem(@RequestBody pen pen)
	{
		return penService.save(pen);
	}
	
	@GetMapping("/get/{id}")
	public pen getItem(@PathVariable("id") Long id)
	{
		return penService.getItem(id);
	}
	
	@PutMapping("/update")
	public pen updateItem(@RequestBody pen pen)
	{
		return penService.update(pen);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable("id") Long id)
	{
		penService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<pen> getAllItem()
	{
		return penService.getAll();
	}
	
	
	
	
}
