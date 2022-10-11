package main;

import configs.ProjectConfiguration;
import models.PersonFromBook;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.AddingNewPersonsService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        PersonFromBook person = new PersonFromBook();

        AddingNewPersonsService addingService;

        addingService = context.getBean(AddingNewPersonsService.class);
        addingService.addNewPersonToBook(person);
    }

}
