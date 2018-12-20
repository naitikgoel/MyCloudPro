package com.project.java.Dao;

import com.project.java.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>, EmployeeRepositoryCustom {
}
