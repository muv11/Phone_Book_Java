package services;

import models.PersonFromBook;
import repositories.ChangingPersonsDataRepository;

public class ChangingPersonsDataService {

    private ChangingPersonsDataRepository changingPersonsDataRepository;

    public ChangingPersonsDataService(ChangingPersonsDataRepository changingPersonsDataRepository) {
        this.changingPersonsDataRepository = changingPersonsDataRepository;
    }

    public void changePersonData(PersonFromBook person) {

    }

}
