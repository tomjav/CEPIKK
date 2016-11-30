package pl.tgrzybowski.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.tgrzybowski.entities.Osoba;
import pl.tgrzybowski.services.OsobaService;

@Controller
@RequestMapping("/osoba")
public class OsobaController {

    @Autowired
    private OsobaService osobaService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addOsoba(@RequestParam("imie") String imie, @RequestParam("nazwisko") String nazwisko, @RequestParam("pesel") Long pesel) {
        Osoba osoba = new Osoba(pesel, imie, nazwisko);
        osobaService.add(osoba);
    }

}
