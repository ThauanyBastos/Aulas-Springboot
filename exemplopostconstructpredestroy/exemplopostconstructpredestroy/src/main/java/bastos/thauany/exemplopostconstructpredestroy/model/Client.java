package bastos.thauany.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 17:13
 */
//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//Springboot
@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente!");
    }
}
