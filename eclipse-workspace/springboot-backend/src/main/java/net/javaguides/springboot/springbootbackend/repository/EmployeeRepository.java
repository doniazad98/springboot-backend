package net.javaguides.springboot.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springbootbackend.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}