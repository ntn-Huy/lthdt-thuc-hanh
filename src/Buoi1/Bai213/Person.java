package Bai213;

public record Person(String name, int age, String email) {
    public static final int ADULT_AGE = 18;

    public Person {
        if (age < 0) throw new IllegalArgumentException("Tuoi am");
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email khong hop le");
        }
        name = (name == null) ? "" : name.trim();
    }

    public Person(String name, int age) {
        this(name, age, "unknown@example.com");
    }

    public boolean isAdult() { return age >= ADULT_AGE; }

    public static Person of(String csvLine) {
        String[] p = csvLine.split(",");
        return new Person(p[0], Integer.parseInt(p[1].trim()), p[2].trim());
    }
}
