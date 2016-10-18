package pl.tgrzybowski.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {
    private String locality;
    private String zipCode;
    private String street;
    private int streetNumber;
}
