package com.petkow.transportservice.model.course;

import com.petkow.transportservice.model.client.Client;
import com.petkow.transportservice.model.timetable.Timetable;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paweł on 2017-04-23.
 */
@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public")
    @SequenceGenerator(name = "public", sequenceName = "course_seq", initialValue = 1, allocationSize = 1)
    private int id_course;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_client")
    private Client user;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_timetable")
    private Timetable timetable;
    //course_date;
    @NotNull
    private int available_seats;
}
