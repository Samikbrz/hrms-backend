package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();
}
