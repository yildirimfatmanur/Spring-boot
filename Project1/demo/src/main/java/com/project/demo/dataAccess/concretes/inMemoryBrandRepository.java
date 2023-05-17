package com.project.demo.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.project.demo.dataAccess.abstracts.BrandRepository;
import com.project.demo.entities.abstracts.Brand;

@Repository // bu sinif bir dataAccess nesnesidir
public class inMemoryBrandRepository implements BrandRepository{

	List<Brand>brands;







	public inMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"AUDI"));
		brands.add(new Brand(3,"HYUNDAI"));
		brands.add(new Brand(4,"RENAULT"));
	}



	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
