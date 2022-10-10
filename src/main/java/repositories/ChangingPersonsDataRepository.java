package repositories;

import models.PersonFromBook;

public interface ChangingPersonsDataRepository {

    void applyPersonDataChanges(PersonFromBook person);

}
