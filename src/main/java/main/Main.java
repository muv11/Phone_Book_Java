package main;

import configs.ProjectConfiguration;
import models.PersonFromBook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.AddingNewPersonsService;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(main.Main.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        PersonFromBook person = new PersonFromBook();

        AddingNewPersonsService addingService;

        addingService = context.getBean(AddingNewPersonsService.class);
        addingService.addNewPersonToBook(person);
    }

}
