package aula04;

public class Veiculo {
    String color;
    int speed;
    int numbWheels;
    String brand;
    String model;
    int numbDoors;

    public void acelerar(int amount) {
        if (speed + amount > 180) {
            speed = 180;
        } else {
            speed += amount;
        }
    }

    public void frear(int amount) {
        if (speed - amount < 0) {
            speed = 0;
        } else {
            speed -= amount;
        }
    }
}
