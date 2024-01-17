package IT.Burrini.Progetto8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import IT.Burrini.Progetto8.model.Persona;

@RestController
public class MyController {

    @GetMapping("/")
    public String index() {
        return "Hello, world!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
            @RequestParam(value = "ziobomba", defaultValue = "brogi") String surname) {
        return String.format("Hello, %s %s!", name, surname);
    }

    @GetMapping("/ciao/{name}/{surname}")
    public String ciao(@PathVariable("name") String n, @PathVariable("surname") String s) {
        return String.format("Hello, %s %s!", n, s);
    }

    @GetMapping("/persona")
    public Persona read() {
        Persona p = new Persona();
        p.setName("Niccolò");
        p.setSurname("Burrini");
        p.setAge(18);

        return p;

    }
}
