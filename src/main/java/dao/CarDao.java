package dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 3));
        cars.add(new Car("AUDI", 4));
        cars.add(new Car("Mercedes", 5));
        cars.add(new Car("Honda", 6));
        cars.add(new Car("Toyota", 7));
    }

    public List<Car> getCars() {
        return cars;
    }
    public Car show(long id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
}
