package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "0") byte count, Model model) {

        CarService carService = new CarServiceImpl();

        model.addAttribute("cars", carService.getCountCars(carService.create5Cars(), count));
        return "showCars";
    }
}
