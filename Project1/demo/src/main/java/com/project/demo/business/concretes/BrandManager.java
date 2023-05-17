package com.project.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.project.demo.business.abstracts.BrandService;
import com.project.demo.dataAccess.abstracts.BrandRepository;
import com.project.demo.entities.abstracts.Brand;

//IOC HER KULLANIMDA SÜREKLİ NEWLMEK YERİNE BELLEKTE BİR SEYİ NEWLE İSTEYENE O REFERNASI VER 1 KEZ URETMEK YETERLI

@Service// AMPUL CİKTİGİNDA CTRL+SPACE YAP
// bu sinif bir business nesnesidir
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;


	@Autowired // yazmasak da calisir
	// constructor bakiyor brandRepositor implement ediyor
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}



	public BrandManager() {
		super();
	}



	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brandRepository.getAll();
	}

}
