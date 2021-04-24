package com.projects.example.hibernate.base.service;

import com.projects.example.hibernate.base.model.Department;
import org.hibernate.Session;

import java.io.Serializable;

public class DepartmentService {
    public Department createDepartment(Session session, String java) {
   return (Department) session.merge(new Department(java));

    }
}
