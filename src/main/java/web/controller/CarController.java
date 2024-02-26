package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> car = carService.getCars();
        if (count >= 5) {
            model.addAttribute("cars", car);
        } else {
            model.addAttribute("cars", car.subList(0, Math.min(count, car.size())));
            
        }
        return "cars";
    }

}
