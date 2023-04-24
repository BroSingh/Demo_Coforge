package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.pen;
import com.example.demo.repo.PenRepo;
import com.example.demo.service.penService;

@Service
public class penServiceImpl implements penService {
	
	@Autowired
	private PenRepo pRepo;

	@Override
	public pen save(pen pen) {
		return pRepo.save(pen);
	}

	@Override
	public pen getItem(Long id) {
		// TODO Auto-generated method stub
		return pRepo.findById(id).get();
	}

	@Override
	public pen update(pen pen) {
		// TODO Auto-generated method stub
		if(pRepo.existsById(pen.getId()))
		{
			
		}
		return pRepo.save(pen);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<pen> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
