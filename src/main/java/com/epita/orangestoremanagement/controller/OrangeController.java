package com.epita.orangestoremanagement.controller;

import com.epita.orangestoremanagement.model.Orange;
import com.epita.orangestoremanagement.service.OrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oranges")
public class OrangeController {

    private final OrangeService orangeService;

    @Autowired
    public OrangeController(OrangeService orangeService) {
        this.orangeService = orangeService;
    }

    @GetMapping
    public List<Orange> getAllOranges() {
        return orangeService.getAllOranges();
    }
}
