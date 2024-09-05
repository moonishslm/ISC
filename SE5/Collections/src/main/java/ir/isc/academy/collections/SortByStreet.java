package ir.isc.academy.collections;

import java.util.Comparator;

public class SortByStreet implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAddress().getStreet().compareTo
                (o2.getAddress().getStreet());
    }
}
