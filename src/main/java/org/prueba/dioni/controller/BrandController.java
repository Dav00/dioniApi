package org.prueba.dioni.controller;

import org.prueba.dioni.models.Brand;
import org.prueba.dioni.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    BrandService brandService;

    @PostMapping
    public ResponseEntity createBrand(@RequestBody Brand brand){
        brandService.saveBrand(brand);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<Brand>> getAllBrands(){
        var brands = brandService.findAllBrands();
        return ResponseEntity.ok().body(brands);
    }
}
