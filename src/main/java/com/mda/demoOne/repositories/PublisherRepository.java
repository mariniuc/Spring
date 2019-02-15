package com.mda.demoOne.repositories;

import com.mda.demoOne.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
