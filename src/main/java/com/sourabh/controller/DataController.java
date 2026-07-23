package com.sourabh.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sourabh.model.Data;
import com.sourabh.service.DataService;

@RestController
public class DataController {
final DataService dataservice;

	DataController(DataService dataservice) {
		this.dataservice = dataservice;
	}

@GetMapping("/getall")
public List<Data> getall(){
	return dataservice.getAll();
}
@GetMapping("/id/{id}") 
public Data getbyid(@PathVariable int id) {
	return dataservice.get(id);
}

@PostMapping("/insert")
public void insert(@RequestBody Data data) {
	dataservice.insert(data);
	System.out.println("Inserted successfully");
}
@PutMapping("/update")
public void update(@RequestBody Data data) {
	dataservice.update(data);
}
@DeleteMapping("/delete")
public void delete(@RequestBody Data data) {
	dataservice.delete(data);
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable int id) {
	dataservice.delete(id);
}
}
