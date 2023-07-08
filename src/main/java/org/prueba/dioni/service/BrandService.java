package org.prueba.dioni.service;

import org.prueba.dioni.models.Brand;
import org.prueba.dioni.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRepository;

    public void saveBrand(Brand brand){
        brandRepository.save(brand);
    }

    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }
}
