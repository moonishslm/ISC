package ir.freeland.spring.initialspring.annotation;

import org.springframework.stereotype.Service;

@Service
public class Print {
    public void print() {
        System.out.println("printed using annotations! ^o^");
    }
}
