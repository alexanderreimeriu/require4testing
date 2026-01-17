package com.require4testing.controller;

import com.require4testing.model.Entwickler;
import com.require4testing.repository.EntwicklerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entwickler")
public class EntwicklerController {

    @Autowired
    private EntwicklerRepository entwicklerRepository;

    // Alle Entwickler abrufen
    @GetMapping
    public List<Entwickler> getAlleEntwickler() {
        return entwicklerRepository.findAll();
    }

    // Einzelnen Entwickler abrufen
    @GetMapping("/{id}")
    public Entwickler getEntwicklerById(@PathVariable Long id) {
        return entwicklerRepository.findById(id).orElse(null);
    }

    // Entwickler erstellen
    @PostMapping
    public Entwickler erstelleEntwickler(@RequestBody Entwickler entwickler) {
        return entwicklerRepository.save(entwickler);
    }

    // Entwickler aktualisieren
    @PutMapping("/{id}")
    public Entwickler aktualisiereEntwickler(@PathVariable Long id, @RequestBody Entwickler entwicklerDetails) {
        Entwickler entwickler = entwicklerRepository.findById(id).orElse(null);
        if (entwickler != null) {
            entwickler.setName(entwicklerDetails.getName());
            entwickler.setFachgebiet(entwicklerDetails.getFachgebiet());
            return entwicklerRepository.save(entwickler);
        }
        return null;
    }

    // Entwickler löschen
    @DeleteMapping("/{id}")
    public void loescheEntwickler(@PathVariable Long id) {
        entwicklerRepository.deleteById(id);
    }
}


