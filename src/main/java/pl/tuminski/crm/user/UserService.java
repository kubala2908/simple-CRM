package pl.tuminski.crm.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
}
