package pl.agataroga.phonebook.models.mappers;

import pl.agataroga.phonebook.models.AddContactForm;
import pl.agataroga.phonebook.models.entities.ContactEntity;

public class   ContactFormToEntityMapper extends Mapper<AddContactForm, ContactEntity> {

    @Override
    public ContactEntity map(AddContactForm key) {
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setName(key.getName());
        contactEntity.setSurname(key.getSurname());
        contactEntity.setPhone(key.getPhone());
        contactEntity.setEmail(key.getEmail());

        return contactEntity;
    }
}
