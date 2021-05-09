package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
}
