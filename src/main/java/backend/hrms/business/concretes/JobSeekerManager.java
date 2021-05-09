package backend.hrms.business.concretes;

import backend.hrms.business.abstracts.JobSeekerService;
import backend.hrms.dataaccess.abstracts.JobSeekerRepository;
import backend.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerRepository jobSeekerRepository;

    @Autowired
    public JobSeekerManager(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    @Override
    public List<JobSeeker> getAll() {
        return jobSeekerRepository.findAll();
    }
}
