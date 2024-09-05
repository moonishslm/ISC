package ir.isc.academy.lambda;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private String fname;
    private int age;
    private double grade;

    @Override
    public String toString() {
        return "Student [name=" + name + ", fname=" + fname + ", age=" + age + ", grade=" + grade + "]";
    }
}
