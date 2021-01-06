package deringo.presentation.person;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import deringo.business.person.boundary.PersonManager;
import deringo.business.person.entity.Person;

@Named
@ManagedBean
@ViewScoped
public class PersonView implements Serializable {
	private static final long serialVersionUID = 1L;

	private PersonManager personManager;
	
	
	@PostConstruct
	public void init() {
		personManager = PersonManager.get();
	}
	
	public List<Person> getPersons() {
		return personManager.getPersons();
	}

}
