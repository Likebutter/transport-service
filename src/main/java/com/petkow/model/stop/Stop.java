package com.petkow.model.stop;

import com.petkow.model.city.City;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name = "public", sequenceName = "stop_seq", initialValue = 1, allocationSize = 1)
    private int id_stop;
    @ManyToOne
    @JoinColumn(referencedColumnName = "city_id")
    private City city;
    @NotNull
    private String stop_name;
    private String street_name;
}
