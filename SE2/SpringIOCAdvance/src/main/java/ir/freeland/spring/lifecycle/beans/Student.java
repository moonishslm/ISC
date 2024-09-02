package ir.freeland.spring.lifecycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;

import java.io.Serializable;

public class Student implements BeanNameAware {
    private String name;
    private String beanName;
    private Weapon weapon;
    private Item item;

    public void customInit() {
        System.out.println("Custom Initialization: Executing custom init for " + getName());
        performSpecialTraining();
    }

    public Student() {
        System.out.println("Instantiation: A new student has been created.");
        this.name = "Mahshad Salimi";
    }

    public void customDestroy() {
        System.out.println("Custom Destruction: " + getName() + " has failed her exam. ⊙︿⊙");
        performFinalAction();
    }

    private void performSpecialTraining() {
        System.out.println("Custom Initialization: " + getName() + " is getting ready for an exam. (╯°□°)╯︵ ┻━┻");
    }


    private void performFinalAction() {
        System.out.println("Custom Destruction: " + getName() + " promises her mom to not fail next time. ಡ_ಡ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: " + getName() + " is preparing to study. :D");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy: " + getName() + ": \"Now I'm waking up, I'll forget everything.\" T_T");
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println("Population of Properties: Equipping " + weapon.getName() + " to " + getName());
    }

    public void setItem(Item item) {
        this.item = item;
        System.out.println("Population of Properties: Adding " + item.getName() + " to " + getName() + "'s inventory");

    }

    public String getName() {
        return name;
    }
}
