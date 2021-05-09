package backend.hrms.business.concretes;

import backend.hrms.business.abstracts.CompanyService;
import backend.hrms.dataaccess.abstracts.CompanyRepository;
import backend.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyManager(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }
}
