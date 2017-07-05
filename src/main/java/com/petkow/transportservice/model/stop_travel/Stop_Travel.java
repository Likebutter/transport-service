package com.petkow.transportservice.model.stop_travel;

import com.petkow.transportservice.model.stop.Stop;
import com.petkow.transportservice.model.travel.Travel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Stop_Travel {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name="public", sequenceName = "stop_travel_seq", initialValue = 1, allocationSize = 1)
    @Id
    private int id_stop_travel;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_stop")
    private Stop stop;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_travel")
    private Travel travel;
    @NotNull
    private int fare;
    @NotNull
    private int stop_number;
   // private
}
