package com.projects.example.hibernate.base.model;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department.getName() + "]";
    }

}
