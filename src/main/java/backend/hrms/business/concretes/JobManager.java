package backend.hrms.business.concretes;

import backend.hrms.business.abstracts.JobService;
import backend.hrms.dataaccess.abstracts.JobRepository;
import backend.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobRepository jobRepository;

    @Autowired
    public JobManager(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAll() {
        return jobRepository.findAll();
    }
}
