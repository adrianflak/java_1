package pl.ernabo.cwiczenie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ernabo.cwiczenie.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>  {

}