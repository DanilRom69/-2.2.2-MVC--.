package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    // Конструктор заполняет список 5 машинами
    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Model S", "Tesla", 2020));
        cars.add(new Car("Mustang", "Ford", 2019));
        cars.add(new Car("Civic", "Honda", 2018));
        cars.add(new Car("Camry", "Toyota", 2021));
        cars.add(new Car("Impreza", "Subaru", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        // Возвращаем подсписок в зависимости от указанного числа машин
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
