package com.autoproject.Dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autoproject.Entity.Auto;
import com.autoproject.Repository.AutoRepository;


@Repository
public class AutoDao {
	@Autowired
	AutoRepository ar;

	public String getStore(List<Auto> l) {
		ar.saveAll(l);
		return "Save Full Data Successfully";
	}

	public List<Auto> getDetails() {
		return ar.findAll();
	}
}