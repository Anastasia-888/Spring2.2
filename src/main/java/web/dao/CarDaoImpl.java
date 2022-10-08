package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = List.of(new Car("BMW", "red"),
            new Car("Audi", "white"),
            new Car("Lada", "black"),
            new Car("Nissan", "blue"),
            new Car("Toyota", "grey"));

    @Override
    public List<Car> getCarList(Integer count) {
        return cars.stream().limit(isNull(count) ? cars.size() : count).collect(Collectors.toList());
    }
}
