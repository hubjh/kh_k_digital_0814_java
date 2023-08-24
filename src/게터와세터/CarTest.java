package 게터와세터;
/*
Date : 2023-08-24
Author : J.H.Hwang
Purpose : 게터와 세터를 설명하는 프로그램입니다.
 */
public class CarTest {
    String manufacturer;
    String modelName;
    String color;
    String year;
    int maxSpeed;

    public CarTest(String manufacturer, String modelName, String color) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
