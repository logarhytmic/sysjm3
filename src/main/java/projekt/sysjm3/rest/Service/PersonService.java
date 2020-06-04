package projekt.sysjm3.rest.Service;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> upstream/master

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD

=======
>>>>>>> upstream/master
import projekt.sysjm3.rest.Entity.Person;
import projekt.sysjm3.rest.Repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

<<<<<<< HEAD
    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();
=======
    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> persons = new ArrayList<Person>();
>>>>>>> upstream/master
        personRepository.findAll().forEach(person -> persons.add(person));
        return persons;
    }

    public Person getPersonById(int id) {
        return personRepository.findById(id).get();
    }

    public void saveOrUpdate(Person person) {
        personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }
<<<<<<< HEAD
=======

	public void updatePerson(Person person) {
		personRepository.save(person);
		
	}
>>>>>>> upstream/master
}
