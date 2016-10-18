package pl.tgrzybowski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.tgrzybowski.Entities.Adress;
import pl.tgrzybowski.Entities.User;
import pl.tgrzybowski.Enumes.Repositories.Services.UserService;
import pl.tgrzybowski.Enumes.Role;

import javax.annotation.PostConstruct;

@Component
public class RunAsStart {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void makeDatabase(){
        Adress bronx = new Adress("New York", "05-100", "Bronx", 22);
        User user = new User("grzybator", "grzybowski", bronx, Role.ADMIN);
        userService.addUser(user);
    }
}
