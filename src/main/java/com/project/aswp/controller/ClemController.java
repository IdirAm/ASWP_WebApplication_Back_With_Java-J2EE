package com.project.aswp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.aswp.model.Clem;
import com.project.aswp.services.ClemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClemController {

	@Autowired
	ClemService service;

	@RequestMapping("/findAll")
	public List<Clem> findAll() {
		return service.findAll();
	}

}
