package com.petkow.transportservice.model.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paweł on 2017-05-17.
 */
@RestController
public class ClientRestController {

    @RequestMapping("/client")
    public String getClient(){
        return "Klient";
    }
}
