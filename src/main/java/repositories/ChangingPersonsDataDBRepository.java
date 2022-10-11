package repositories;

import models.PersonFromBook;
import org.springframework.stereotype.Repository;

@Repository
public class ChangingPersonsDataDBRepository implements ChangingPersonsDataRepository {

    public void applyPersonDataChanges(PersonFromBook person) {

    }
}
