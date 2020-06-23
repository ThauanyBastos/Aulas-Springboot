package bastos.thauany.exemploLombok.controllers;

import bastos.thauany.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 14:18
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public  String index() {
        return "Lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto Produto";
//    }
}
