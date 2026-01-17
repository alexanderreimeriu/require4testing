package com.require4testing.controller;

import com.require4testing.model.Anforderung;
import com.require4testing.repository.AnforderungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anforderungen")
public class AnforderungController {

    @Autowired
    private AnforderungRepository anforderungRepository;

    // Alle Anforderungen abrufen
    @GetMapping
    public List<Anforderung> getAlleAnforderungen() {
        return anforderungRepository.findAll();
    }

    // Eine einzelne Anforderung abrufen
    @GetMapping("/{id}")
    public Anforderung getAnforderungById(@PathVariable Long id) {
        return anforderungRepository.findById(id).orElse(null);
    }

    // Neue Anforderung erstellen
    @PostMapping
    public Anforderung erstelleAnforderung(@RequestBody Anforderung anforderung) {
        return anforderungRepository.save(anforderung);
    }

    // Bestehende Anforderung aktualisieren
    @PutMapping("/{id}")
    public Anforderung aktualisiereAnforderung(@PathVariable Long id, @RequestBody Anforderung anforderungDetails) {
        Anforderung anforderung = anforderungRepository.findById(id).orElse(null);
        if (anforderung != null) {
            anforderung.setTitel(anforderungDetails.getTitel());
            anforderung.setBeschreibung(anforderungDetails.getBeschreibung());
            anforderung.setPrioritaet(anforderungDetails.getPrioritaet());
            anforderung.setStatus(anforderungDetails.getStatus());
            anforderung.setEntwickler(anforderungDetails.getEntwickler());
            return anforderungRepository.save(anforderung);
        }
        return null;
    }

    // Anforderung löschen
    @DeleteMapping("/{id}")
    public void loescheAnforderung(@PathVariable Long id) {
        anforderungRepository.deleteById(id);
    }
}

