package com.project.aswp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aswp.model.Clem;
import com.project.aswp.repositories.ClemRepository;

@Service
public class ClemService {

	@Autowired
	ClemRepository repository;

	public List<Clem> findAll() {
		return repository.findAll();
	}
}
