package com.digitalhouse.digital.house.books.service.model.service;

import com.digitalhouse.digital.house.books.service.model.dto.BookDTO;

import java.util.List;

public interface IBookService {

    public List<BookDTO> findAll();

    public BookDTO findById(Long id);

    public BookDTO save(BookDTO book);

    public BookDTO update(BookDTO book,Long id);

    public void delete(Long book);
}
