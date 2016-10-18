package pl.tgrzybowski.Repositories.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.tgrzybowski.Entities.Character;
import pl.tgrzybowski.Repositories.CharacterRepository;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public void addCharacter(Character character){
        characterRepository.save(character);
    }
}
