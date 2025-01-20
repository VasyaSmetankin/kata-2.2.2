package web.service;

import web.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    List<Car> getLimitedCars(int count);
}
