package com.petkow.transportservice.model.client;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Client {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name="public",sequenceName = "client_seq",initialValue = 1, allocationSize = 1)
    @Id
    private int id_client;
    @NotNull
    @Size(max = 20)
    private String login;
    @NotNull
    @Size(max = 20)
    private String password;
    @NotNull
    private String name;
    @NotNull
    private String second_name;
    @NotNull
    private long phone_number;
    @NotNull
    private boolean enabled;
}
