package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Component
//@RestController
public class CarServiceImpl implements CarService {
    private List<Car> carList = getCars();

    public List<Car> getCars() {
        List<Car> car = new ArrayList<>();
        car.add(new Car("Mitsubishi", "Padjero", 1995));
        car.add(new Car("Audy", "A5", 2015));
        car.add(new Car("Honda", "Accord", 2010));
        car.add(new Car("BMW", "x5", 2000));
        car.add(new Car("Toyota", "Camry", 2022));
        return car;
    }


    @Override
    public List<Car> countCars(int count) {
        List<Car> carList = getCars();
        if (count >= 5) {
            return carList;
        } else {
            return carList.subList(0, Math.min(count, carList.size()));
        }
    }
}
