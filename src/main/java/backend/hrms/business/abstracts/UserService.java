package backend.hrms.business.abstracts;

import backend.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
