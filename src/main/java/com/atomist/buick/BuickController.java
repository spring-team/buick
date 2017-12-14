package com.atomist.buick;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/")
class BuickController {

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }


    @RequestMapping(method = GET, path = "car/{name}")
    public String car(@PathVariable String name) {
        return name + " drives a Buick!";
    }

}
