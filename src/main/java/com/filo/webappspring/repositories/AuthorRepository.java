package com.filo.webappspring.repositories;

import com.filo.webappspring.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
