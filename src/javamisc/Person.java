package javamisc;/*
 *
 * Created by
 * Binkam Abhilash
 * on 21-October-2023
 * datastructures-algorithms
 *
 */


import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }*/

    @Override
    public int hashCode() {
        // Override the hashCode method to provide a consistent hash code value
        return 42; // A constant value for demonstration purposes
    }
}
