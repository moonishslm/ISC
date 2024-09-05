package ir.isc.academy.springjpa;

import ir.isc.academy.springjpa.relation.ItemBaseRun;
import ir.isc.academy.springjpa.relation.OneToOneRelation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EntityScan(basePackages = {"ir/isc/academy/springjpa/relation"})
public class SpringJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);


        ItemBaseRun ItemBaseRun = context.getBean(ItemBaseRun.class);
        ItemBaseRun.sampleRun();

        OneToOneRelation OneToOne = context.getBean(OneToOneRelation.class);
        OneToOne.sampleRun();

    }

}
