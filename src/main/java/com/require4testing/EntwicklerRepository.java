package com.require4testing.repository;

import com.require4testing.model.Entwickler;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository für den Zugriff auf Entwickler-Daten.
 * Bindeglied zwischen Datenbank und Service-Schicht.
 */
public interface EntwicklerRepository extends JpaRepository<Entwickler, Long> {
}
