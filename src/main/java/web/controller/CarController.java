package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.CarService;
import web.CarServiceimpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            count = 10;
        }

        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "black", 220));
        list.add(new Car("Audi", "white", 310));
        list.add(new Car("Kia", "red", 150));
        list.add(new Car("Honda", "green", 176));
        list.add(new Car("Lexus", "purple", 250));
        CarService carService = new CarServiceimpl();
        List<Car> result = carService.getCars(list, count);
        model.addAttribute("result", result);

        return "cars";
    }
}
