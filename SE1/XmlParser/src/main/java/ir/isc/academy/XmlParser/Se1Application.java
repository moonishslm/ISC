package ir.isc.academy.XmlParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ir.isc.academy.XmlParser.entities.Student;
import ir.isc.academy.XmlParser.entities.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Se1Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Se1Application.class, args);

        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setFirstName("Mahshad");
        student1.setLastName("Salimi");
        student1.setAge(5);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("generated-from-java-student.xml"), student1);

        //reading the xml file in order to print
        File xmlFile = new File("generated-from-java-student.xml");
        Student salimiXml = xmlMapper.readValue(xmlFile, Student.class);
        System.out.println(salimiXml.toString());

        //for json
        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setFirstName("Mahshad");
        student2.setLastName("Salimi");
        student2.setAge(25);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("generated-from-java-student.json"), student2);

        //reading the json file in order to print
        File jsonFile = new File("generated-from-java-student.json");
        Student salimiJson = objectMapper.readValue(jsonFile, Student.class);
        System.out.println(salimiJson.toString());

        //for teacher entity
        Teacher teacher = new Teacher();
        teacher.setTeacherId(1);
        teacher.setFirstName("Farbod");
        teacher.setLastName("Nazari");
        teacher.setAge(75);

        xmlMapper.writeValue(new File("generated-from-java-teacher.xml"), teacher);

        //reading the xml file in order to print
        xmlFile = new File("generated-from-java-teacher.xml");
        Teacher teacherXml = xmlMapper.readValue(xmlFile, Teacher.class);
        System.out.println(teacherXml.toString());

        //reading the json file in order to print
        objectMapper.writeValue(new File("generated-from-java-teacher.json"), teacher);

        jsonFile = new File("generated-from-java-teacher.json");
        Teacher teacherJson = objectMapper.readValue(jsonFile, Teacher.class);
        System.out.println(teacherJson.toString());
    }
}
