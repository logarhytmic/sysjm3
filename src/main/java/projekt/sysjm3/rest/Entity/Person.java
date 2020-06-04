package projekt.sysjm3.rest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;






@Entity
public class Person{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String lastName;	
	public String firstName;
	public int age;
	public char gender;
	public long ssn;
	public String cityOfResidence;
	public String countryOfResicence;
	
	
    public Person(int id,String firstName, String lastName, int age, char gender, long ssn, String cityOfResidence, String countryOfResicence) {
        setId(id);
    	setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        setSsn(ssn);
        setCityOfResidence(cityOfResidence);
        setCountryOfResidence(countryOfResicence);
    }

	public void setId(int id) {
		this.id = id;
		
	}

	public void setCountryOfResidence(String country) {
		this.countryOfResicence = country;
		
	}

	public void setCityOfResidence(String city) {
		this.cityOfResidence = city;
		
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
		
	}

	public void setGender(char gender) {
		this.gender = gender;
		
	}

	public void setAge(int age) {
		this.age = age; 
		
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
		
	}

	public int getId() {
		
		return id;
	}

	
}
