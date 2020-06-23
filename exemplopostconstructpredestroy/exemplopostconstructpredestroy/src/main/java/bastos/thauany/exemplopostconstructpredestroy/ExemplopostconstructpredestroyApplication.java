package bastos.thauany.exemplopostconstructpredestroy;

import bastos.thauany.exemplopostconstructpredestroy.dao.ClientDAO;
import bastos.thauany.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 17:13
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Thauany", "Bastos"));
		System.out.println("ClientDao: " + clientDAO);
		System.out.println("Client: " + clientDAO.getClient().toString());
	}

}
