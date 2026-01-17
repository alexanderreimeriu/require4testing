# Require4Testing

Dies ist ein prototypischer Webanwendungs‑Prototyp zur Verwaltung von Anforderungen und Entwicklern.  
Erstellt im Rahmen des Moduls **IPWA02‑01 „Programmierung von industriellen Informationssystemen“** an der **IU Internationale Hochschule**.

---

## 🎯 Zielsetzung

Die Anwendung dient zur prototypischen Umsetzung von fünf ausgewählten Anforderungen im ersten Sprint des Projekts. Sie bildet den typischen Ablauf des manuellen Testmanagements ab:  
von der Erfassung einer Anforderung über die Zuordnung eines Entwicklers bis zur Anzeige, Bearbeitung und Löschung der Anforderung.

---

## ✅ Umgesetzte Anforderungen

1. **Als Requirements Engineer möchte ich neue Anforderungen erstellen können.**  
2. **Als Testmanager möchte ich Testläufe anlegen können.** *(optional ergänzt)*  
3. **Als Testfallersteller möchte ich zu einer Anforderung Testfälle erstellen können.** *(optional ergänzt)*  
4. **Als Tester möchte ich einem Testfall Ergebnisse zuordnen können.** *(optional ergänzt)*  
5. **Als Testmanager möchte ich einem Testlauf Testfälle und Tester zuordnen können.** *(optional ergänzt)*

> Hinweis: Die fünf ursprünglich ausgewählten Anforderungen bilden den Kernprozess ab, der im Prototyp umgesetzt wurde.

---

## ⚙️ Technologien

| Bereich | Technologie |
|---------|-------------|
| Programmiersprache | Java |
| Framework | Spring Boot |
| Template Engine | Thymeleaf |
| Persistenz | Spring Data JPA |
| Datenbank (Dev/Prototyp) | H2 (in‑memory) |
| Build Tool | Maven |

---

## 📦 Projektstruktur

require4testing/
├── .gitignore
├── README.md
├── pom.xml
└── src/
└── main/
├── java/com/require4testing/
│ ├── controller/
│ ├── model/
│ └── repository/
└── resources/
├── application.properties
└── templates/
└── requirements/
├── list.html
└── form.html

---

## 🚀 Anwendung starten

### Voraussetzungen

- Java JDK (mind. Version 17)
- Maven
- Eine IDE (z. B. IntelliJ IDEA)

### Schritte

```bash
git clone https://github.com/alexanderreimeriu/require4testing.git
cd require4testing
mvn spring-boot:run
Nach dem Start ist die Anwendung erreichbar unter:

http://localhost:8080/web/requirements
Hinweis: Falls Port 8080 belegt ist, wird automatisch ein anderer Port verwendet (z. B. 8081). Der korrekte Port steht in der Konsole.

🧪 Funktionen in der Anwendung
Anforderungen anzeigen

Neue Anforderung erfassen

Anforderungen bearbeiten

Anforderungen löschen

Entwickler beim Anlegen/Bearbeiten zuordnen

🗃️ Datenbank (H2)
Die Anwendung verwendet eine In‑Memory‑Datenbank (H2). Sie wird beim Start automatisch geladen.

H2-Konsole
Erreichbar unter:
http://localhost:8080/h2-console
Zugangsdaten:

JDBC-URL: jdbc:h2:mem:testdb

Benutzer: sa

Passwort: (leer lassen)

🖼️ Screenshots / Dokumentation
(Screenshots der Benutzeroberfläche werden im Anhang der Fallstudie eingefügt.)

📘 Weiterführende Dokumentation
Diese README ergänzt die schriftliche Fallstudie mit folgenden Inhalten:

Technologiestack und Architekturkonzept

Datenmodell (inkl. Entitäten und Relationen)

UML-Diagramm (Struktur der Anwendung)

Screenshots der Webanwendung

🔖 Autor
Name: Alexander Reimer

Studiengang: Wirtschaftsinformatik

Modul: IPWA02‑01 – Programmierung von industriellen Informationssystemen

Hochschule: IU Internationale Hochschule

---
