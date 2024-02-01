package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getListCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("ВАЗ", 2105, 180.3));
        list.add(new Car("ВАЗ", 2106, 178.4));
        list.add(new Car("ВАЗ", 2107, 168.0));
        list.add(new Car("ВАЗ", 2108, 182.7));
        list.add(new Car("ВАЗ", 2109, 191.3));
        return list;
    }
}
