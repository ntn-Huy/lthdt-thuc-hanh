package Bai1C;

public class Q6 {
    static class Car {
        String brand;
        public void Car() {
            brand = "VinFast";
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.brand);
    }
}
