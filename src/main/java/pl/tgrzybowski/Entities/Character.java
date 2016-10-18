package pl.tgrzybowski.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity(name = "postac")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Character {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private ZonedDateTime createdDate;
}
