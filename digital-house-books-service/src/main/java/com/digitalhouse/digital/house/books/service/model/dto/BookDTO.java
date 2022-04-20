package com.digitalhouse.digital.house.books.service.model.dto;

import com.digitalhouse.digital.house.books.service.model.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public BookDTO(BookEntity book) {
        this.id = book.getId();
        this.nmBook = book.getNmBook();
        this.tpBook = book.getTpBook();
        this.nmVersion = book.getNmVersion();
    }

    private Long id;

    private String nmBook;

    private String tpBook;

    private int nmVersion;
}
