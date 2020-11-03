package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(":: Primary Bean ::");
        System.out.println(myController.sayHello());

        System.out.println(":: property injection ::");

        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println(":: setter injection ::");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println(":: constructor injection ::");

        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
