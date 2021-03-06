package bastos.thauany.exemploinjecaodedependencia.model;

import bastos.thauany.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 16:35
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("miauu");
    }
}
