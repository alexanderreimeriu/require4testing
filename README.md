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

yaml
Code kopieren

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
