package bastos.thauany.exemploLombok.model;

import lombok.*;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 15:08
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return Retorna a idade em meses. x12
     */
    public int calculateAgeInMouths() {
        return this.age * 12;
    }


}
