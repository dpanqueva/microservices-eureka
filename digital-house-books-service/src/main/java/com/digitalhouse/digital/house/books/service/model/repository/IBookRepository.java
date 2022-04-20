package com.digitalhouse.digital.house.books.service.model.repository;


import com.digitalhouse.digital.house.books.service.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<BookEntity, Long> {

}
