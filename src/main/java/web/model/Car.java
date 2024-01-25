package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private double maxSpeed;

    public Car(String model, int series, double maxSpeed) {
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public static List<Car> getListCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("ВАЗ", 2105, 180.3));
        list.add(new Car("ВАЗ", 2106, 178.4));
        list.add(new Car("ВАЗ", 2107, 168.0));
        list.add(new Car("ВАЗ", 2108, 182.7));
        list.add(new Car("ВАЗ", 2109, 191.3));
        list.add(new Car("ВАЗ", 2110, 205.3));
        list.add(new Car("ВАЗ", 2111, 205.3));
        return list;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
