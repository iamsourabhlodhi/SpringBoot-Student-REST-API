package com.sourabh.service;
import java.util.List;


import org.springframework.stereotype.Service;
import com.sourabh.Repository.DataRepo;
import com.sourabh.model.Data;
@Service
public class DataService {
	
	final DataRepo repo;

	DataService(DataRepo repo) {
		this.repo = repo;
	}
	
	public List<Data> getAll(){
		return repo.findAll();
		
	}
	
	public Data get(int id) {
		return repo.findById(id).orElse(new Data());
	}
	
	public void insert(Data data) {
		repo.save(data);
	}
	
	public void update(Data data) {
		repo.save(data);
	}
	
	public void delete(Data data) {
		repo.delete(data);
	}
	
	public void delete(int id) {
		
		repo.deleteById(id);
	}
	
}
