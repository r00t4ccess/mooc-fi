package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        if (name == null || name.length() > 40 || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or over 40 characters");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
