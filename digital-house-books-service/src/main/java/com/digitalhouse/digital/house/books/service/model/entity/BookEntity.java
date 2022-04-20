package com.digitalhouse.digital.house.books.service.model.entity;

import com.digitalhouse.digital.house.books.service.model.dto.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class BookEntity {

    public BookEntity(BookDTO book) {
        this.id = book.getId();
        this.nmBook = book.getNmBook();
        this.tpBook = book.getTpBook();
        this.nmVersion = book.getNmVersion();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_book")
    private String nmBook;

    @Column(name = "tp_book")
    private String tpBook;

    @Column(name = "nm_version")
    private int nmVersion;

    @Column(name = "sn_lease")
    private String snLease;


}
