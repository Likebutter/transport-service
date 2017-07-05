package com.petkow.transportservice.model.city;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paweł on 2017-04-23.
 */
@Data
@Entity
public class City {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name="public", sequenceName = "city_seq", initialValue = 1, allocationSize = 1)
    @Id
    private int id_city;

    @NotNull
    private String city_name;
}
