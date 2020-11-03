package com.realdolmen.dependencyinjectionexamples;

import com.realdolmen.dependencyinjectionexamples.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.sayHello());
    }

}
