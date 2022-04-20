package com.digitalhouse.digital.house.books.service.controller;


import com.digitalhouse.digital.house.books.service.model.dto.BookDTO;
import com.digitalhouse.digital.house.books.service.model.dto.ResponseDTO;
import com.digitalhouse.digital.house.books.service.model.enums.EResponseType;
import com.digitalhouse.digital.house.books.service.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/list")
    public ResponseEntity<ResponseDTO<List<BookDTO>>> myList() {
        return new ResponseEntity<>(
                new ResponseDTO<>(bookService.findAll(), EResponseType.SUCCESS
                        , "SUCCESS", "200"), HttpStatus.OK);
    }

    @GetMapping("detail/{id}")
    public ResponseEntity<ResponseDTO<BookDTO>> detail(@PathVariable Long id) {
        return new ResponseEntity<>(
                new ResponseDTO<>(bookService.findById(id), EResponseType.SUCCESS
                        , "SUCCESS", "200"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO<BookDTO>> create(@RequestBody BookDTO book) {
        return new ResponseEntity<>(
                new ResponseDTO<>(bookService.save(book), EResponseType.SUCCESS
                        , "SUCCESS", "201"), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO<BookDTO>> update(@RequestBody BookDTO book, @PathVariable Long id) {
        return new ResponseEntity<>(
                new ResponseDTO<>(bookService.update(book, id), EResponseType.SUCCESS
                        , "SUCCESS", "201"), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO<String>> delete(@PathVariable Long id) {
        bookService.delete(id);
        return new ResponseEntity<>(
                new ResponseDTO<>("", EResponseType.SUCCESS
                        , "SUCCESS", "204"), HttpStatus.NO_CONTENT);
    }
}
