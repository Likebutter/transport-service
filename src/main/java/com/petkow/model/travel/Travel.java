package com.petkow.model.travel;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Travel {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name="public", sequenceName = "travel_seq", initialValue = 1, allocationSize = 1)
    @Id
    private int id_travel;
    @NotNull
    private String travel_name;
    @NotNull
    private int stops_number;
}
