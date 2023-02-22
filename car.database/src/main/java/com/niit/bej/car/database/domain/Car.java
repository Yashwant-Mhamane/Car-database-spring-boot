package com.niit.bej.car.database.domain;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {
        private int id;
        private String name;
        private String carType;
        private String Company;
        private double price;
        private double safetyRating;

        public Car(int id, String name, String carType, String company, double price, double safetyRating) {
                this.id = id;
                this.name = name;
                this.carType = carType;
                Company = company;
                this.price = price;
                this.safetyRating = safetyRating;
        }

        public Car() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCarType() {
                return carType;
        }

        public void setCarType(String carType) {
                this.carType = carType;
        }

        public String getCompany() {
                return Company;
        }

        public void setCompany(String company) {
                Company = company;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public double getSafetyRating() {
                return safetyRating;
        }

        public void setSafetyRating(double safetyRating) {
                this.safetyRating = safetyRating;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Car car = (Car) o;
                return id == car.id && Double.compare(car.price, price) == 0 && Double.compare(car.safetyRating, safetyRating) == 0 && Objects.equals(name, car.name) && Objects.equals(carType, car.carType) && Objects.equals(Company, car.Company);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, name, carType, Company, price, safetyRating);
        }

        @Override
        public String toString() {
                return "Car{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", carType='" + carType + '\'' +
                        ", Company='" + Company + '\'' +
                        ", price=" + price +
                        ", safetyRating=" + safetyRating +
                        '}';
        }
}
