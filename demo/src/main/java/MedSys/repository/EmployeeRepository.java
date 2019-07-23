package MedSys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.Employee;



public interface EmployeeRepository extends CrudRepository <Employee, Integer> {
		
		List<Employee> findByemployeeID(int employeeID);
		
		
	}
		
	

