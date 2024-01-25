package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import static web.model.Car.getListCars;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        count = (count == null) ? 0 : count;
        model.addAttribute("cars", carService.getCountCars(getListCars(), count));
        return "car";
    }
}
