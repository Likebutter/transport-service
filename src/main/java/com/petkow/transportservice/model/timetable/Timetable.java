package com.petkow.transportservice.model.timetable;

import com.petkow.transportservice.model.travel.Travel;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name = "public", sequenceName = "stop_timetable", initialValue = 1, allocationSize = 1)
    private int id_timetable;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_travel")
    private Travel travel;
    //departure_time;
    //arrival_time
}
