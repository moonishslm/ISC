package ir.isc.academy.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private String fname;
    private int age;
    private Address address;


    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name) &&
                fname.equals(other.fname) &&
                Objects.equals(address, other.address) &&
                age == other.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", fname=" + fname + ", age=" + age + ", address=" + address + "]";
    }

}

