package com.petkow.model.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name="public",sequenceName = "user_seq",initialValue = 1, allocationSize = 1)
    private int id_user;
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
    @Max(9)
    @Min(9)
    private long phone_number;
    @NotNull
    private boolean enabled;
}
