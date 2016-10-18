package pl.tgrzybowski.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.tgrzybowski.Enumes.Role;

import javax.persistence.*;

@Entity
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
}
