package deringo.presentation.person;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

import deringo.business.person.boundary.PersonManager;
import deringo.business.person.entity.Person;

@Model
public class PersonView {

	private PersonManager personManager;
	
	
	@PostConstruct
	public void init() {
		personManager = PersonManager.get();
	}
	
	public List<Person> getPersons() {
		return personManager.getPersons();
	}

}
