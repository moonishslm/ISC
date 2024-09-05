package ir.isc.academy.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mahshad", "Salimi", 26, 18.13));
        students.add(new Student("Farbod", "Nazari", 25, 18.64));
        students.add(new Student("Mahshad1", "Salimi1", 15, 15));
        students.add(new Student("Farbod1", "Nazari1", 15, 9));
        students.add(new Student("Mahshad2", "Salimi2", 10, 5));
        students.add(new Student("Farbod2", "Nazari2", 10, 19));
        students.add(new Student("Mahshad3", "Salimi3", 10, 2));
        students.add(new Student("Farbod3", "Nazari3", 50, 15));
        students.add(new Student("Mahshad4", "Salimi4", 50, 12));
        students.add(new Student("Farbod4", "Nazari4", 50, 20));


        // sort by grade descending and add to a new list
        Comparator<Student> gradeComparator = Comparator.comparing(Student::getGrade);
        List<Student> sortedByAge = students.stream().sorted(gradeComparator.reversed()).collect(Collectors.toList());
        System.out.println("Sort By Grade Descending:");
        sortedByAge.forEach(t -> System.out.println(t));

        addBreaker();

        // sort by age ascending
        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
        students.sort(ageComparator);
        System.out.println("Sort By Age Ascending:");
        students.forEach(System.out::println);

        addBreaker();

        // partition by grades higher and lower than 10
        Map<Boolean, List<Student>> gradePartition =
                students.stream().collect(Collectors.partitioningBy(p -> p.getGrade() >= 10));
        System.out.println("Grades Higher than 10:");
        gradePartition.get(true).forEach(System.out::println);
        System.out.println("\nGrades Lower than 10:");
        gradePartition.get(false).forEach(System.out::println);

        addBreaker();

        // groupBy age
        Map<Integer, List<Student>> groupAge =
                students.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println("Group By Age:");
        System.out.println(groupAge);

        addBreaker();

        // average of grades
        double averageGrade = students
                .stream().mapToDouble(Student::getGrade).average().getAsDouble();
        System.out.println("Average of Grades is: " + averageGrade);

        addBreaker();

        // average grades of students older than 18
        averageGrade = students.stream()
                        .filter(p -> p.getAge() >= 18).collect(Collectors.averagingDouble(p -> p.getGrade()));
        System.out.println("Average Grades of Students Older than 18 is: " + averageGrade );
    }


    private static void addBreaker() {
        System.out.println("\n-----------------------------------------\n");
    }
}
