package services;

import models.PersonFromBook;
import repositories.AddingNewPersonsRepository;

public class AddingNewPersonsService {

    private AddingNewPersonsRepository addingNewPersonsRepository;

    public AddingNewPersonsService(AddingNewPersonsRepository addingNewPersonsRepository) {
        this.addingNewPersonsRepository = addingNewPersonsRepository;
    }

    public void addNewPersonToBook(PersonFromBook person) {

    }

}
