package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars;
        if (count == null || count >= 5) {
            cars = carService.getCars(5);  // Показываем весь список (5 машин)
        } else {
            cars = carService.getCars(count);  // Показываем указанное количество машин
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
