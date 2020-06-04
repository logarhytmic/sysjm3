package projekt.sysjm3.rest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity
public class Person{
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String lastName;	
	public String firstName;
	public int age;
	public int socialSecurityNumber;
	public String cityOfResidence;
	public String countryOfResicence;
	
}
