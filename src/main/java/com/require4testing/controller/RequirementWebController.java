package com.require4testing.controller;

import com.require4testing.model.Entwickler;
import com.require4testing.model.Requirement;
import com.require4testing.repository.EntwicklerRepository;
import com.require4testing.repository.RequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/requirements")
public class RequirementWebController {

    @Autowired
    private RequirementRepository requirementRepository;

    @Autowired
    private EntwicklerRepository entwicklerRepository;

    @GetMapping
    public String listRequirements(Model model) {
        List<Requirement> requirements = requirementRepository.findAll();
        model.addAttribute("requirements", requirements);
        return "requirements/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("requirement", new Requirement());
        model.addAttribute("entwicklerList", entwicklerRepository.findAll());
        return "requirements/form";
    }

    @PostMapping("/save")
    public String saveRequirement(@ModelAttribute Requirement requirement) {
        requirementRepository.save(requirement);
        return "redirect:/web/requirements";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Requirement requirement = requirementRepository.findById(id).orElseThrow();
        model.addAttribute("requirement", requirement);
        model.addAttribute("entwicklerList", entwicklerRepository.findAll());
        return "requirements/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteRequirement(@PathVariable Long id) {
        requirementRepository.deleteById(id);
        return "redirect:/web/requirements";
    }
}

