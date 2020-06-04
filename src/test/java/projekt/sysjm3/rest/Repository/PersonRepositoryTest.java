package projekt.sysjm3.rest.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import projekt.sysjm3.rest.Entity.Person;
import projekt.sysjm3.rest.Service.PersonService;

class PersonRepositoryTest {

	@Autowired
	PersonService ps;

	@Autowired
	PersonRepository pr;

	@Test
	void test() {
		fail("Not yet implemented");
	}

}