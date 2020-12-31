package deringo.business.person.boundary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

import deringo.business.person.entity.Person;

public class PersonManager {

	private static PersonManager manager;
	
	public static PersonManager get() {
		if (manager == null) {
			manager = new PersonManager();
		}
		return manager;
	}
	
	private List<Person> persons;
	
	private PersonManager() {
		init();
	}
	
	private void init() {
		persons = new ArrayList<>();
		Faker faker = new Faker(Locale.GERMANY);
		for (int i=0; i<1000; i++) {
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();
			Date dayOfBirth = faker.date().birthday();
			String phoneNumber = faker.phoneNumber().phoneNumber();
			String streetName = faker.address().streetName();
			String streetAddressNumber = faker.address().streetAddressNumber();
			String zipCode = faker.address().zipCode();
			String city = faker.address().city();
			String state = faker.address().state();
			
			Person person = new Person(firstName, lastName, dayOfBirth, phoneNumber, streetName, streetAddressNumber, zipCode, city, state);
			persons.add(person);
		}
	}
	
	public List<Person> getPersons() {
		return persons;
	}
}
