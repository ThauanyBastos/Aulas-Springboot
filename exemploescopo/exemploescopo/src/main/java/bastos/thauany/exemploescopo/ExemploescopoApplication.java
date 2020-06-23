package bastos.thauany.exemploescopo;

import bastos.thauany.exemploescopo.dao.ClassDAO;
import bastos.thauany.exemploescopo.dao.ClassJDBC;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC objetoJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassDAO objetoDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto da classe JDBC: " + objetoJDBC);
		System.out.println("Objeto da classe DAO: " + objetoDAO);
	}

}
