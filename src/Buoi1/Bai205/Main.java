package Bai205;

public class Main {
    public static void main(String[] args) {
        Employee original = new Employee("Lan", new Address("Ha Noi", "12 Tran Phu"));
        Employee shallow = original.clone();
        Employee deep = new Employee(original);

        shallow.getAddress().setCity("Hue");
        System.out.println("Sau khi sua ban shallow: " + original);

        deep.getAddress().setCity("Can Tho");
        System.out.println("Sau khi sua ban deep   : " + original);
        System.out.println("Ban deep               : " + deep);
    }
}
