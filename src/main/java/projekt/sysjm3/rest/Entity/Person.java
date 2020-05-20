package projekt.sysjm3.rest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	public String lastName;
//	@Column(name = "firstname", nullable = false)
//	public String firstName;
//	@Column(name = "age", nullable = false)
//	public int age;
//	@Column(name = "ssn", nullable = false)
//	public int socialSecurityNumber;
//	@Column(name = "city")
//	public String cityOfResidence;
//	@Column(name = "country")
//	public String countryOfResicence;

//	H2 gillar inte enum, oklart varför. 
//
//	public enum gender {
//		MALE, FEMAIL
//	};

	public Person() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int getSocialSecurityNumber() {
//		return socialSecurityNumber;
//	}
//
//	public void setSocialSecurityNumber(int socialSecurityNumber) {
//		this.socialSecurityNumber = socialSecurityNumber;
//	}
//
//	public String getCityOfResidence() {
//		return cityOfResidence;
//	}
//
//	public void setCityOfResidence(String cityOfResidence) {
//		this.cityOfResidence = cityOfResidence;
//	}
//
//	public String getCountryOfResicence() {
//		return countryOfResicence;
//	}
//
//	public void setCountryOfResicence(String countryOfResicence) {
//		this.countryOfResicence = countryOfResicence;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", socialSecurityNumber="
//				+ socialSecurityNumber + ", cityOfResidence=" + cityOfResidence + ", countryOfResicence="
//				+ countryOfResicence + "]";
//	}

}
