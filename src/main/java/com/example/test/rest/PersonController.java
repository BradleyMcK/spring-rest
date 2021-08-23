package com.example.test.rest;

import com.example.test.domain.Person;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/person")
public class PersonController {

    @GetMapping()
    public Person getPerson() {

        return new Person("bradley");
    }

    @GetMapping("/query")
    public Person getPerson(@RequestParam String firstName) {

        return new Person(firstName);
    }

}
