package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"Car1", "Red"));
        cars.add(new Car(2,"Car2", "Red"));
        cars.add(new Car(3,"Car3", "Red"));
        cars.add(new Car(4,"Car4", "Red"));
        cars.add(new Car(5,"Car5", "Red"));
    }

@Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
