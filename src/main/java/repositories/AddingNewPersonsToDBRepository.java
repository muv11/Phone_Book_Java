package repositories;

import models.PersonFromBook;
import org.springframework.stereotype.Repository;

@Repository
public class AddingNewPersonsToDBRepository implements AddingNewPersonsRepository {

    public void storeNewPerson(PersonFromBook person) {
        System.out.println("person stored");
    }

}
