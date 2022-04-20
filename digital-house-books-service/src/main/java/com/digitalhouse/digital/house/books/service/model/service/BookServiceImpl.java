package com.digitalhouse.digital.house.books.service.model.service;


import com.digitalhouse.digital.house.books.service.exceptions.NotContentException;
import com.digitalhouse.digital.house.books.service.model.dto.BookDTO;
import com.digitalhouse.digital.house.books.service.model.entity.BookEntity;
import com.digitalhouse.digital.house.books.service.model.repository.IBookRepository;
import com.digitalhouse.digital.house.books.service.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    private static String msg = "No data found for this search";

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private BookUtil bookUtil;

    @Override
    public List<BookDTO> findAll() {
        return bookUtil.convertEntityToDTOToList(bookRepository.findAll());
    }

    @Override
    public BookDTO findById(Long id) {
        BookEntity book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            throw new NotContentException(msg);
        }
        return bookUtil.convertEntityToDTO(book);
    }

    @Override
    public BookDTO save(BookDTO book) {

        return bookUtil.convertEntityToDTO(bookRepository.save(bookUtil.convertDTOToEntity(book)));
    }

    @Override
    public BookDTO update(BookDTO book, Long id) {

        BookEntity bookEntity = bookRepository.findById(id).orElse(null);
        if (bookEntity == null) {
            throw new NotContentException(msg);
        }
        bookEntity.setNmBook(book.getNmBook());
        bookEntity.setTpBook(book.getTpBook());
        bookEntity.setNmVersion(book.getNmVersion());
        return bookUtil.convertEntityToDTO(bookRepository.save(bookEntity));
    }

    @Override
    public void delete(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElse(null);
        if (bookEntity == null) {
            throw new NotContentException(msg);
        }
        bookRepository.delete(bookEntity);
    }
}
