package com.loops.react.repositories;

import org.springframework.data.repository.CrudRepository;
import com.loops.react.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, String>{
	
	@Override
    void delete(Contact deleted);

}
