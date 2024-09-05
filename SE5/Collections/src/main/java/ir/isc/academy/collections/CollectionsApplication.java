package ir.isc.academy.collections;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class CollectionsApplication {

    public static void main(String[] args) {

        Address address1 = new Address("S1", "C1", "Co1");
        Address address2 = new Address("S2", "C2", "Co2");
        Address address3 = new Address("S3", "C3", "Co3");


        Person mahshad = new Person("Mahshad", "Salimi",26, address1);
        Person farbod = new Person("Farbod", "Nazari",25, address2);
        Person anya = new Person("Anya", "Montazar",10, address3);


//        // way 1
//        Person[] presonsArray = {mahshad, farbod, anya};
//        List<Person> persons= Arrays.asList(presonsArray);
//        System.out.println(persons);

        //way 2 adding
        List persons = new ArrayList();
        persons.add(mahshad);
        persons.add(farbod);
        persons.add(anya);

        //removing
        persons.remove(0);

        //contains
        Person mira = new Person("Mira", "Nazari", 15, address3);
        System.out.println(persons.contains(mira));

        //index of method
        Person newPerson = new Person("Mira", "Nazari", 10,  address3);
        System.out.println(persons.indexOf(newPerson));

        //sort with class SortByStreet compare to
        Collections.sort(persons , new SortByStreet());

        //binary search
        int found = Collections.binarySearch(persons, farbod);
        System.out.println(persons.get(found) );











    }

}
