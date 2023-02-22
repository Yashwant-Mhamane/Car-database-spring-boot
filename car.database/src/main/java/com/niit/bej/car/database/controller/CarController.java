package com.niit.bej.car.database.controller;

import com.niit.bej.car.database.domain.Car;
import com.niit.bej.car.database.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public List<Car> getCar() {
        return carService.getCar();
    }
}
