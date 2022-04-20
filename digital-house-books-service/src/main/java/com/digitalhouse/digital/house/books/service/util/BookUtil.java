package com.digitalhouse.digital.house.books.service.util;


import com.digitalhouse.digital.house.books.service.model.dto.BookDTO;
import com.digitalhouse.digital.house.books.service.model.entity.BookEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookUtil {

    public List<BookDTO> convertEntityToDTOToList(List<BookEntity> actorEntities) {
        return actorEntities.stream().map(book -> new BookDTO(book.getId()
                , book.getNmBook(), book.getTpBook(), book.getNmVersion())).collect(Collectors.toList());
    }

    public BookDTO convertEntityToDTO(BookEntity actor) {
        return new BookDTO(actor);
    }

    public BookEntity convertDTOToEntity(BookDTO actor) {
        return new BookEntity(actor);
    }

}
