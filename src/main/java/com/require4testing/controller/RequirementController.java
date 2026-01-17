package com.require4testing.controller;

import com.require4testing.dto.RequirementDTO;
import com.require4testing.model.Entwickler;
import com.require4testing.model.Requirement;
import com.require4testing.repository.EntwicklerRepository;
import com.require4testing.repository.RequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/requirements")
public class RequirementController {

    @Autowired
    private RequirementRepository requirementRepository;

    @Autowired
    private EntwicklerRepository entwicklerRepository;

    @GetMapping
    public List<RequirementDTO> getAllRequirements() {
        return requirementRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<String> createRequirement(@RequestBody RequirementDTO dto) {
        Optional<Entwickler> entwicklerOpt = entwicklerRepository.findById(dto.getEntwicklerId());
        if (entwicklerOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Entwickler mit ID " + dto.getEntwicklerId() + " nicht gefunden.");
        }

        Requirement requirement = new Requirement();
        requirement.setTitel(dto.getTitel());
        requirement.setBeschreibung(dto.getBeschreibung());
        requirement.setStatus(dto.getStatus());
        requirement.setEntwickler(entwicklerOpt.get());

        requirementRepository.save(requirement);
        return ResponseEntity.ok("Requirement erfolgreich erstellt.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRequirement(@PathVariable Long id, @RequestBody RequirementDTO dto) {
        Optional<Requirement> reqOpt = requirementRepository.findById(id);
        if (reqOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Optional<Entwickler> entwicklerOpt = entwicklerRepository.findById(dto.getEntwicklerId());
        if (entwicklerOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Entwickler mit ID " + dto.getEntwicklerId() + " nicht gefunden.");
        }

        Requirement requirement = reqOpt.get();
        requirement.setTitel(dto.getTitel());
        requirement.setBeschreibung(dto.getBeschreibung());
        requirement.setStatus(dto.getStatus());
        requirement.setEntwickler(entwicklerOpt.get());

        requirementRepository.save(requirement);
        return ResponseEntity.ok("Requirement erfolgreich aktualisiert.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRequirement(@PathVariable Long id) {
        if (!requirementRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        requirementRepository.deleteById(id);
        return ResponseEntity.ok("Requirement erfolgreich gelöscht.");
    }

    private RequirementDTO convertToDTO(Requirement req) {
        return new RequirementDTO(
                req.getId(),
                req.getTitel(),
                req.getBeschreibung(),
                req.getStatus(),
                req.getEntwickler() != null ? req.getEntwickler().getId() : null
        );
    }
}

