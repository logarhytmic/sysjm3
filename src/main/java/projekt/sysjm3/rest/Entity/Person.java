package projekt.sysjm3.rest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;

	public String lastName;	
	
	public String firstName;

	public int age;
	
	public int socialSecurityNumber;
	
	public String cityOfResidence;

	public String countryOfResicence;

//	H2 gillar inte enum, oklart varför. 
//
//	public static enum gender {
//		MALE, FEMAIL
//	};
//
	
}
