package manohar.munnur.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manohar.munnur.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
