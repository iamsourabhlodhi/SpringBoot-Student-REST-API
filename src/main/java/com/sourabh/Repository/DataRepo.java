package com.sourabh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourabh.model.Data;

public interface DataRepo extends JpaRepository<Data, Integer>{

}
