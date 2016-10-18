package pl.tgrzybowski;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pl.tgrzybowski.Entities.Adress;
import pl.tgrzybowski.Entities.User;
import pl.tgrzybowski.Enumes.Repositories.Services.UserService;
import pl.tgrzybowski.Enumes.Role;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;
    private static User user;

    @BeforeClass
    public static void init() {
       // userService = new UserService();
        user = new User("grzybator", "z7x6ernc", new Adress("New Yourk", "05-100", "BroadWay", 45), Role.GUEST);
    }

    @Test
    public void addUserTest(){
        String userId = user.getUsername();
        assertFalse("Baza danych musi byc pusta na początku testu!", userService.getAllUsers().size() == 0);
        userService.addUser(user);
        List<User> userById = userService.getUserById(userId);
        User userFromDataBase = userById.stream().findFirst().get();
        if(userById.size() > 1) fail("Username must by unique");
        assertEquals("Uzytkownik pobrany z bazy nie jest tym którym dodalismy!",user,userFromDataBase);
    }
}
