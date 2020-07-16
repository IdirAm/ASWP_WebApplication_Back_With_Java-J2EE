package com.project.aswp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.aswp.model.Clem;

@Repository
public interface ClemRepository extends JpaRepository<Clem, Long> {

}

