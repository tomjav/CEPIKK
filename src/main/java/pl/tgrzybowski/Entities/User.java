package pl.tgrzybowski.Entities;

import com.sun.istack.internal.NotNull;
import lombok.*;
import pl.tgrzybowski.Enumes.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @Column(name = "Nazwa")
    private String username;
    @Column(name = "Hasło")
    private String password;
    @Embedded
    private Adress adress;
    @Enumerated(EnumType.STRING)
    @Column(name="Rola")
    private Role role;

    //(jeden uzytkownik moze miec wiele postaci)
    @OneToMany
    @JoinColumn(name = "ownerId")
    private List<Character> phones = new ArrayList<>();

}
