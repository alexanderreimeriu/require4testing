package com.require4testing.dto;

public class RequirementDTO {
    private Long id;
    private String titel;
    private String beschreibung;
    private String status;
    private Long entwicklerId;

    public RequirementDTO() {
    }

    public RequirementDTO(Long id, String titel, String beschreibung, String status, Long entwicklerId) {
        this.id = id;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
        this.entwicklerId = entwicklerId;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getEntwicklerId() {
        return entwicklerId;
    }

    public void setEntwicklerId(Long entwicklerId) {
        this.entwicklerId = entwicklerId;
    }
}

