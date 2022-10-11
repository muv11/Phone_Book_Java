package services;

import models.PersonFromBook;
import org.springframework.stereotype.Service;
import repositories.AddingNewPersonsRepository;

@Service
public class AddingNewPersonsService {

    private AddingNewPersonsRepository addingNewPersonsRepository;

    public AddingNewPersonsService(AddingNewPersonsRepository addingNewPersonsRepository) {
        this.addingNewPersonsRepository = addingNewPersonsRepository;
    }

    public void addNewPersonToBook(PersonFromBook person) {
        addingNewPersonsRepository.storeNewPerson(person);
    }

}
