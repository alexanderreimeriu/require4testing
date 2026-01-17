package com.require4testing.model;

import jakarta.persistence.*;

@Entity
public class Anforderung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titel;
    private String beschreibung;
    private String prioritaet;
    private String status;

    @ManyToOne
    @JoinColumn(name = "entwickler_id")
    private Entwickler entwickler;

    // Standard-Konstruktor
    public Anforderung() {
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getPrioritaet() {
        return prioritaet;
    }

    public void setPrioritaet(String prioritaet) {
        this.prioritaet = prioritaet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Entwickler getEntwickler() {
        return entwickler;
    }

    public void setEntwickler(Entwickler entwickler) {
        this.entwickler = entwickler;
    }
}
