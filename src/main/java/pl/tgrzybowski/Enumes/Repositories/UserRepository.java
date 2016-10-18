package pl.tgrzybowski.Enumes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tgrzybowski.Entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    public List<User> findByUsername(String username);
}
