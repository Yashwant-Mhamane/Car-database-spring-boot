package com.niit.bej.car.database.service;

import com.niit.bej.car.database.domain.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarService {
    public List<Car> getCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Harrier", "Mid Size SUV", "Tata Motors", 2200000.00, 5.0));
        carList.add(new Car(2, "XUV300", "Compact SUV", "Mahindra", 1000000.00, 4.5));
        carList.add(new Car(3, "Fortuner", "Full Size SUV", "Toyota", 4200000.00, 4.2));
        return carList;
    }
}
