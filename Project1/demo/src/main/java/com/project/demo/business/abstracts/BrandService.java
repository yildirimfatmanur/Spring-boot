package com.project.demo.business.abstracts;

import java.util.List;

//import org.springframework.stereotype.Service;

import com.project.demo.entities.abstracts.Brand;


public interface BrandService {
	List<Brand> getAll();
}
