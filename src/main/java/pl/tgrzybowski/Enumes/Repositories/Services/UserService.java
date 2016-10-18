package pl.tgrzybowski.Enumes.Repositories.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tgrzybowski.Entities.User;
import pl.tgrzybowski.Enumes.Repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }
    public List<User> getUserById(String id){
        return userRepository.findByUsername(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
