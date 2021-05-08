package com.projects.example.hibernate.base;

import java.util.List;

import com.projects.example.hibernate.base.config.HibernateUtil;
import com.projects.example.hibernate.base.model.Department;
import com.projects.example.hibernate.base.model.Employee;
import com.projects.example.hibernate.base.model.User;
import com.projects.example.hibernate.base.service.DepartmentService;
import org.hibernate.Query;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(new User("Agron","Shehaj"));
        session.save(new User("Jack","Smith"));
        session.save(new User("Foo","test"));


        session.getTransaction().commit();

        Query q = session.createQuery("From User ");
        List<User> resultList = q.list();

        System.out.println("num of users:" + resultList.size());
        for (User next : resultList) {
            System.out.println("next users: " + next);
        }

    }

}
