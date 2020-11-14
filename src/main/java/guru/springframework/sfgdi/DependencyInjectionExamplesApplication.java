package guru.springframework.sfgdi;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        FakeDataSource source = ctx.getBean(FakeDataSource.class);

        System.out.println(source.getUser());
        System.out.println(source.getPassword());
        System.out.println(source.getUrl());
    }

}
