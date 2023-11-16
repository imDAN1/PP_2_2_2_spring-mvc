package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCountCars(List<Car> cars, byte count) {
        if (count > 5 || count == 0) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}