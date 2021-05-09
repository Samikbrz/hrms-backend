package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.Company;
import backend.hrms.entities.concretes.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
}
