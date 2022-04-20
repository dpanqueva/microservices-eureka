package com.digitalhouse.digital.house.lend.lease.service.client;

import com.digitalhouse.digital.house.lend.lease.service.model.dto.ws.actor.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorsClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${url.actor.detail}")
    private String url;

    public Response consumeActorDetail(String cdActor) {
        ResponseEntity<Response> responseWs = restTemplate.exchange(url.concat("/").concat(cdActor), HttpMethod.GET, null
                , new ParameterizedTypeReference<>() {
                });
        return responseWs.getBody();
    }
}
