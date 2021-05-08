package com.projects.example.hibernate.base.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<User> users;

}
