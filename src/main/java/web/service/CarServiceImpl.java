package web.service;


import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars() {
        return List.of(
                new Car(1L, "BMW", 1000L),
                new Car(2L, "Audi", 2000L),
                new Car(3L, "Mercedes", 3000L),
                new Car(4L, "Toyota", 4000L),
                new Car(5L, "Nissan", 5000L)
        );
    }

    public List<Car> getLimitedCars(int count) {
        return getCars().stream().limit(count).toList();
    }
}
