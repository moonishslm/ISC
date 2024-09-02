package ir.freeland.spring.lifecycle.config;

import ir.freeland.spring.lifecycle.beans.Character;
import ir.freeland.spring.lifecycle.beans.Item;
import ir.freeland.spring.lifecycle.beans.Student;
import ir.freeland.spring.lifecycle.beans.Weapon;
import ir.freeland.spring.lifecycle.processor.MagicBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    Student student() {
        Student student = new Student();
        student.setWeapon(pen());
        student.setItem(paper());
        return student;
    }

    @Bean
    Weapon pen() {
        return new Weapon("Pen");
    }

    @Bean
    Item paper() {
        return new Item("Paper");
    }
}
