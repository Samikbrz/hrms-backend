package backend.hrms.business.concretes;

import backend.hrms.business.abstracts.EmployerService;
import backend.hrms.dataaccess.abstracts.EmployerRepository;
import backend.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerRepository employerRepository;

    @Autowired
    public EmployerManager(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public List<Employer> getAll() {
        return employerRepository.findAll();
    }
}
