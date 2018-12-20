package com.project.java.Dao;

import com.project.java.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepositoryCustom{
    //@Query("SELECT p FROM Person p WHERE LOWER(p.name) = LOWER(:name)")
    Employee findByName(@Param("name") String name);
    Employee findByExperience(@Param("experience") Integer experience);
    Employee findByAge(@Param("age") Integer age);
    List<Employee> findByNameAndAge(@Param("name") String name, @Param("age") Integer age);
}
