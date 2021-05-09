package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();
}
