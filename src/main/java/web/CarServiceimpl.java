package web;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceimpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> list, int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
