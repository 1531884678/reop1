package com.day04.dome004;

import java.util.Objects;

public class Car {
    private String commodity;

    public Car() {
    }

    public Car(String commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "commodity='" + commodity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(commodity, car.commodity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodity);
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }
}
