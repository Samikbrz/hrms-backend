package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
