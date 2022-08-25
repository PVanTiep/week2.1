package com.example.week21.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.List;

import static org.hibernate.annotations.CascadeType.DELETE;

@Entity
@Getter
@Setter
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "departmentId", nullable = false)
    private Long departmentId;

    @Column(name = "dept_name", length = 255, nullable = false)
    private String dept_name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "department")
    @Cascade(value = DELETE)
    private List<Employee> employeeList;
}
