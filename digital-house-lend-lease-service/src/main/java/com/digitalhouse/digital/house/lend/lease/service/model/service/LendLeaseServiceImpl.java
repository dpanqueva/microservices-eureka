package com.digitalhouse.digital.house.lend.lease.service.model.service;

import com.digitalhouse.digital.house.lend.lease.service.client.ActorsClient;
import com.digitalhouse.digital.house.lend.lease.service.client.BooksClient;
import com.digitalhouse.digital.house.lend.lease.service.exceptions.NotContentException;
import com.digitalhouse.digital.house.lend.lease.service.model.dto.ActorBookDTO;
import com.digitalhouse.digital.house.lend.lease.service.model.repository.ILendLeaseRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LendLeaseServiceImpl implements ILendLeaseService {

    private static String msg = "No data found for this search";

    @Autowired
    private BooksClient booksClient;

    @Autowired
    private ActorsClient actorsClient;

    @Autowired
    private ILendLeaseRest lendLeaseRepo;

    @Override
    public ActorBookDTO findInfoBookById(Long idBook, String cdActor) {

        if (lendLeaseRepo.findByCdBookAndCdActor(idBook,cdActor) == null) {
            throw new NotContentException(msg);
        }

        ActorBookDTO actorBook = new ActorBookDTO();
        var actor = actorsClient.consumeActorDetail(cdActor);
        actorBook.setCdActor(actor.getServiceResponse().getCdActor());
        actorBook.setTpActor(actor.getServiceResponse().getTpActor());
        actorBook.setNmActor(actor.getServiceResponse().getNmActor());
        var book = booksClient.consumeActorDetail(idBook);
        actorBook.setCdBook(book.getServiceResponse().getId());
        actorBook.setNmBook(book.getServiceResponse().getNmBook());
        actorBook.setTpBook(book.getServiceResponse().getTpBook());
        actorBook.setNmVersion(book.getServiceResponse().getNmVersion());

        return actorBook;
    }
}
