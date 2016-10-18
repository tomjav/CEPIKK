package pl.tgrzybowski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tgrzybowski.Entities.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
