package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "0") byte count, Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 200, 5));
        cars.add(new Car("Nissan GTR", 950, 3));
        cars.add(new Car("BMW M3", 750, 5));
        cars.add(new Car("Kamaz", 185, 2));
        cars.add(new Car("Toyota", 85, 5));

        CarService carService = new CarServiceImpl();

        model.addAttribute("cars", carService.getCountCars(cars, count));
        return "showCars";
    }
}
