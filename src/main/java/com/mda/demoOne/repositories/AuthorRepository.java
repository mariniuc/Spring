package com.mda.demoOne.repositories;

import com.mda.demoOne.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
