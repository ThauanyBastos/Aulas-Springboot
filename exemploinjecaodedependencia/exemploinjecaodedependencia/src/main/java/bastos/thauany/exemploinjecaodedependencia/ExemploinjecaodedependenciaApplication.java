package bastos.thauany.exemploinjecaodedependencia;

import bastos.thauany.exemploinjecaodedependencia.model.Cat;
import bastos.thauany.exemploinjecaodedependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 16:39
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}
