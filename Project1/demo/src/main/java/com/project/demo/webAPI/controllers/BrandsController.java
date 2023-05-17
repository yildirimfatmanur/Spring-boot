package com.project.demo.webAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.project.demo.business.abstracts.BrandService;
import com.project.demo.entities.abstracts.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController { // erisim noktasi
	private BrandService brandService;

	@Autowired
	//parametrelere bak uygulmayı tara kim brandservice implement ediyor onun new'lenmis halini ver
public BrandsController(BrandService brandService) {
	super();
	this.brandService = brandService;
}
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandService.getAll();
	}

}
