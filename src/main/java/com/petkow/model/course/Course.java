package com.petkow.model.course;

import com.petkow.model.timetable.Timetable;
import com.petkow.model.user.User;
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
    @JoinColumn(referencedColumnName = "is_user")
    private User user;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_timetable")
    private Timetable timetable;
    //course_date;
    @NotNull
    private int available_seats;
}
