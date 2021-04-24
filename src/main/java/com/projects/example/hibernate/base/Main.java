package com.projects.example.hibernate.base;

import java.util.List;

import com.projects.example.hibernate.base.config.HibernateUtil;
import com.projects.example.hibernate.base.model.Department;
import com.projects.example.hibernate.base.model.Employee;
import com.projects.example.hibernate.base.service.DepartmentService;
import org.hibernate.Query;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();



        DepartmentService departmentService = new DepartmentService();
        Department department = departmentService.createDepartment(session, "java");



        session.save(new Employee("Jakab Gipsz", department));
        session.save(new Employee("Captain Nemo", department));

        session.getTransaction().commit();

        Query q = session.createQuery("From Employee ");

        List<Employee> resultList = q.list();

        System.out.println("num of employess:" + resultList.size());
        for (Employee next : resultList) {
            System.out.println("next employee: " + next);
        }

    }

}
