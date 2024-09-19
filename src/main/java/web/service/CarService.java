package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Vesta", "Lada", 2023));
        cars.add(new Car("2106", "Ваз", 2019));
        cars.add(new Car("Santa Fe", "Hyundai", 2021));
        cars.add(new Car("Camry", "Toyota", 2021));
        cars.add(new Car("Impreza", "Subaru", 2022));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
