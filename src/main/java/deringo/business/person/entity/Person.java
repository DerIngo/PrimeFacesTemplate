package deringo.business.person.entity;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	private Date dayOfBirth;
	private String phoneNumber;
	private String streetName;
	private String streetAddressNumber;
	private String zipCode;
	private String city;
	private String state;

	public Person() {
		// default Constructor is required for Person.class.newInstance();
	}
	
	public Person(String firstName, String lastName, Date dayOfBirth, String phoneNumber, String streetName, String streetAddressNumber, String zipCode, String city, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.streetAddressNumber = streetAddressNumber;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dayOfBirth=" + dayOfBirth
				+ ", phoneNumber=" + phoneNumber + ", streetName=" + streetName + ", streetAddressNumber="
				+ streetAddressNumber + ", zipCode=" + zipCode + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dayOfBirth == null) ? 0 : dayOfBirth.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetAddressNumber == null) ? 0 : streetAddressNumber.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dayOfBirth == null) {
			if (other.dayOfBirth != null)
				return false;
		} else if (!dayOfBirth.equals(other.dayOfBirth))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetAddressNumber == null) {
			if (other.streetAddressNumber != null)
				return false;
		} else if (!streetAddressNumber.equals(other.streetAddressNumber))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetAddressNumber() {
		return streetAddressNumber;
	}

	public void setStreetAddressNumber(String streetAddressNumber) {
		this.streetAddressNumber = streetAddressNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
