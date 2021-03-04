package pl.agataroga.phonebook.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.agataroga.phonebook.models.AddContactForm;
import pl.agataroga.phonebook.models.mappers.ContactFormToEntityMapper;
import pl.agataroga.phonebook.models.repositories.ContactRepository;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public void addContact(AddContactForm addContactForm){
        contactRepository.save(new ContactFormToEntityMapper().map(addContactForm));
    }
}
