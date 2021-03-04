package pl.agataroga.phonebook.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.agataroga.phonebook.models.entities.ContactEntity;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {
}
