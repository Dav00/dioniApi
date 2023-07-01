package org.prueba.dioni.repository;

import org.prueba.dioni.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "select * from car order by date desc limit 1", nativeQuery = true)
    public Optional<Car> getLatestCar();
}
