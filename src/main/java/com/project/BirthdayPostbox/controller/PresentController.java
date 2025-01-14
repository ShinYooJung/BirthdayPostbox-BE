package com.project.BirthdayPostbox.controller;

import com.google.gson.JsonObject;
import com.project.BirthdayPostbox.dto.PresentDTO;
import com.project.BirthdayPostbox.service.PresentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PresentController {

    @Autowired
    PresentService service;

    @RequestMapping(value = "new-present", method = RequestMethod.POST)
    public String newPresent(@RequestBody PresentDTO presentDTO) {
        return service.newPresent(presentDTO);
    }

    @RequestMapping("present")
    public JsonObject showPresent(@RequestParam("id") String present_id, @RequestParam("owner_code") String owner_code) {
        return service.showPresent(present_id, owner_code);
    }
}
