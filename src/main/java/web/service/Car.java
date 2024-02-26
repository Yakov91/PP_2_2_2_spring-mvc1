package web.service;

public class Car {
    private int year;

    private String brandCar;

    private String model;

    public Car(String brandCar, String model, int year) {
        this.brandCar = brandCar;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
