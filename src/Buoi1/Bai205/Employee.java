package Bai205;

public class Employee implements Cloneable {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Address getAddress() { return address; }

    @Override
    public String toString() { return name + " @ " + address; }
}
