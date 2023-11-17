package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public List<Car> create5Cars() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", 200, 5));
        cars.add(new Car("Nissan GTR", 950, 3));
        cars.add(new Car("BMW M3", 750, 5));
        cars.add(new Car("Kamaz", 185, 2));
        cars.add(new Car("Toyota", 85, 5));
        return cars;
    }

    @Override
    public List<Car> getCountCars(List<Car> cars, byte count) {
        if (count > 5 || count == 0) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
