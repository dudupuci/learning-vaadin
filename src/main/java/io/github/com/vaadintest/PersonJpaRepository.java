package io.github.com.vaadintest;

import io.github.com.vaadintest.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonJpaRepository extends JpaRepository<Person, UUID> {
}
