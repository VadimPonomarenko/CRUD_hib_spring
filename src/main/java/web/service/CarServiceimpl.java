package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceimpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            count = 10;
        }
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "black", 220));
        list.add(new Car("Audi", "white", 310));
        list.add(new Car("Kia", "red", 150));
        list.add(new Car("Honda", "green", 176));
        list.add(new Car("Lexus", "purple", 250));
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
