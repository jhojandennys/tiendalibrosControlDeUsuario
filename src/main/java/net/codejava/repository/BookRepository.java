package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.entity.Book;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}
