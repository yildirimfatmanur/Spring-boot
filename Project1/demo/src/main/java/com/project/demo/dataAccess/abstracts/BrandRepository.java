package com.project.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.demo.entities.abstracts.Brand;


public interface BrandRepository {
	List<Brand> getAll();
	// getAll i cagiran biri markaları listeler
}
