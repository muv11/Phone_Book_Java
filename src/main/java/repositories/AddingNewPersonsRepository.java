package repositories;

import models.PersonFromBook;

public interface AddingNewPersonsRepository {

    void storeNewPerson(PersonFromBook person);

}
