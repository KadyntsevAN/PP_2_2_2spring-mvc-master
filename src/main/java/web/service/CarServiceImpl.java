package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCars(List<Car> list, Integer count) {
        count = (count == null) ? 0 : count;
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
