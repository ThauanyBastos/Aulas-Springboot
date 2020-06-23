package bastos.thauany.exemploinjecaodedependencia;

import bastos.thauany.exemploinjecaodedependencia.interfaces.AnimalInterface;
import bastos.thauany.exemploinjecaodedependencia.model.Cat;
import bastos.thauany.exemploinjecaodedependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 16:36
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();
    }
}
