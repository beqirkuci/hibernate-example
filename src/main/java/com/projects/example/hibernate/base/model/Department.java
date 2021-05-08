package com.projects.example.hibernate.base.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Data
@Entity
@Table
public class Department {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
    private List<Employee> employees = new ArrayList<Employee>();

    public Department() {
        super();
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(Long id) {
        this.id = id;
    }
}
