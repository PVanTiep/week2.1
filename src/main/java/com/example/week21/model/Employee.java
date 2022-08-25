package com.example.week21.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employeeId",nullable = false)
    private Long employeeId;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthDate", nullable = false)
    private Date birthDate;

    @Column(name = "gender", nullable = false)
    private boolean gender;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

}
