package org.prueba.dioni.controller;

import org.prueba.dioni.models.Car;
import org.prueba.dioni.repository.CarRepository;
import org.prueba.dioni.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/cars")
@RestController
public class CarController {
    CarService carService;

    public CarController(CarService carService,
                         CarRepository carRepository){
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> cars = carService.getAllCars();

        if(cars.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.ok(cars);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable() Long id){
        Optional<Car> car = carService.getCarById(id);
        if(car.isPresent()){
            return ResponseEntity.ok(car.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PostMapping
    public ResponseEntity createCar(@RequestBody Car car){
        carService.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCar(@PathVariable() Long id){
        carService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/latest")
    public ResponseEntity getLatestCar(){
        Optional<Car> car = carService.getLatestCar();
        if(car.isPresent()){
            return ResponseEntity.ok().body(car);
        }else{
            return ResponseEntity.noContent().build();
        }
    }
}
