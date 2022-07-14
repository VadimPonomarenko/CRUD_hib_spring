package web.model;

public class Car {
    private String carBrand;
    private String color;
    private int hp;


    public Car() {
    }

    public Car(String carBrand, String color, int hp) {
        this.carBrand = carBrand;
        this.color = color;
        this.hp = hp;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Brand= " + carBrand + ", Color= " + color + ", Horse Powers= " + hp;
    }
}
