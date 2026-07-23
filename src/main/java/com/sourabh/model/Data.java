package com.sourabh.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Data {
	@Id
private int id ;
private String name;
private int sem;
private String dept;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSem() {
	return sem;
}
public void setSem(int sem) {
	this.sem = sem;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Data [name=" + name + ", rollno=" + id + ", sem=" + sem + ", dept=" + dept + "]";
}

}
