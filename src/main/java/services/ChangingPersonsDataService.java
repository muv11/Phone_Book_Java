package services;

import models.PersonFromBook;
import org.springframework.stereotype.Service;
import repositories.ChangingPersonsDataRepository;

@Service
public class ChangingPersonsDataService {

    private ChangingPersonsDataRepository changingPersonsDataRepository;

    public ChangingPersonsDataService(ChangingPersonsDataRepository changingPersonsDataRepository) {
        this.changingPersonsDataRepository = changingPersonsDataRepository;
    }

    public void changePersonData(PersonFromBook person) {

    }

}
