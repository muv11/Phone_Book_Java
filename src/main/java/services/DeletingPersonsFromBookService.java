package services;

import models.PersonFromBook;
import org.springframework.stereotype.Service;
import repositories.DeletingPersonsFromBookRepository;

@Service
public class DeletingPersonsFromBookService {

    private DeletingPersonsFromBookRepository deletingPersonsFromBookRepository;

    public DeletingPersonsFromBookService(DeletingPersonsFromBookRepository deletingPersonsFromBookRepository) {
        this.deletingPersonsFromBookRepository = deletingPersonsFromBookRepository;
    }

    public void deletePersonFromBook(PersonFromBook person) {

    }

}
