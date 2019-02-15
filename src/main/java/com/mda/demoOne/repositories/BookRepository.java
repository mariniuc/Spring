package com.mda.demoOne.repositories;

import com.mda.demoOne.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
