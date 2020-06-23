package bastos.thauany.helloworldrestreoisitories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 14:29
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Ola! Hello World com Rest Repositories";
    }
}
