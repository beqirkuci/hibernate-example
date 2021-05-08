package com.projects.example.hibernate.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private String username;
    @ManyToOne
    private Role role;


    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }
}
