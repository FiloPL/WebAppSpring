package com.filo.webappspring.repositories;

import com.filo.webappspring.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

public interface BookRepository extends CrudRepository<Book, Long> {
}