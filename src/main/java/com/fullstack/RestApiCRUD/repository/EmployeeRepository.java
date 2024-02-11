package com.fullstack.RestApiCRUD.repository;

import com.fullstack.RestApiCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
