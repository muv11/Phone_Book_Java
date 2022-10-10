package services;

import models.PersonFromBook;
import repositories.DeletingPersonsFromBookRepository;

public class DeletingPersonsFromBookService {

    private DeletingPersonsFromBookRepository deletingPersonsFromBookRepository;

    public DeletingPersonsFromBookService(DeletingPersonsFromBookRepository deletingPersonsFromBookRepository) {
        this.deletingPersonsFromBookRepository = deletingPersonsFromBookRepository;
    }

    public void deletePersonFromBook(PersonFromBook person) {

    }

}
