package com.require4testing.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Entwickler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fachgebiet;

    @OneToMany(mappedBy = "entwickler")
    private List<Anforderung> anforderungen;

    // Standard-Konstruktor
    public Entwickler() {
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public List<Anforderung> getAnforderungen() {
        return anforderungen;
    }

    public void setAnforderungen(List<Anforderung> anforderungen) {
        this.anforderungen = anforderungen;
    }
}
