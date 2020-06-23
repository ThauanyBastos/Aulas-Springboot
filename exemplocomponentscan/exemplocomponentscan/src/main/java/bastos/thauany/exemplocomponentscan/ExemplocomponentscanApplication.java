package bastos.thauany.exemplocomponentscan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 18:30
 */
@SpringBootApplication
@ComponentScan("dao")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("ClassDAO: " + objectDAO);
		System.out.println("ObjectJDBC dentro do ObjectDAO: " + objectDAO.getClassJDBC());
	}

}
