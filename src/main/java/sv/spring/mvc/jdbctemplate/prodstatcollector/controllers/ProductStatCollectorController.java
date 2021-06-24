package sv.spring.mvc.jdbctemplate.prodstatcollector.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@ComponentScan("sv.spring.mvc.jdbctemplate.prodstatcollector")
@EnableWebMvc
public class ProductStatCollectorController {

    @GetMapping("/start")
    public String startUp() {
        return "start";
    }
}
