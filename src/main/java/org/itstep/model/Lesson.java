package org.itstep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id")
    private Integer id;

    @Column(name = "room")
    private String room;

    @ManyToOne
    private  Group group;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Subject subject;

}
