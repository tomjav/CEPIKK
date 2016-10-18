package pl.tgrzybowski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.tgrzybowski.Entities.Adress;
import pl.tgrzybowski.Entities.Character;
import pl.tgrzybowski.Entities.User;
import pl.tgrzybowski.Repositories.CharacterRepository;
import pl.tgrzybowski.Repositories.Services.CharacterService;
import pl.tgrzybowski.Repositories.Services.UserService;
import pl.tgrzybowski.Enumes.Role;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class RunAsStart {

    @Autowired
    private UserService userService;
    @Autowired
    private CharacterService characterService;

    @PostConstruct
    public void makeDatabase(){
        Adress bronx = new Adress("New York", "05-100", "Bronx", 22);
        List<Character> characters = Arrays.asList(new Character("Wojownik", ZonedDateTime.now()), new Character("Wojownik", ZonedDateTime.now()));
        User user = new User("grzybator", "grzybowski", bronx, Role.ADMIN, characters);

        characters.stream().forEach(e -> characterService.addCharacter(e));
        userService.addUser(user);


    }
}
