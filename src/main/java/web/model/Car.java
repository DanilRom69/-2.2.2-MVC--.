package web.model;

public class Car {
    private String model;
    private String manufacturer;
    private int year;

    public Car(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
