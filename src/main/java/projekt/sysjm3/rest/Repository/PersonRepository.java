package projekt.sysjm3.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import projekt.sysjm3.rest.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {


}
