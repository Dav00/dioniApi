package org.prueba.dioni.service;

import org.prueba.dioni.models.Car;
import org.prueba.dioni.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    CarRepository carRepository;
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

    public Optional<Car> getLatestCar(){
        return carRepository.getLatestCar();
    }
}
