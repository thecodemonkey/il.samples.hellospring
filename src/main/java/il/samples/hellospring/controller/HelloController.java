package il.samples.hellospring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping()
    public String get() {
        return "hello spring!";
    }

    @GetMapping("/{id}")
    public String getWithPathVar(@PathVariable String id) {
        return "hello uri path variable! " + id;
    }

    @GetMapping("/params")
    public String getWithUrlParms(String id) {
        return "hello url params! " + id ;
    }

    @GetMapping("/exp")
    public String getException() throws Exception {
        throw new Exception("mööp...");
    }
}
