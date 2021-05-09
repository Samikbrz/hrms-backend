package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
