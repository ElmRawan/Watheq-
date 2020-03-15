package de.cosh.azure.repository;

import de.cosh.azure.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cosh on 06.12.2016.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
