package bastos.thauany.exemplopostconstructpredestroy.dao;

import bastos.thauany.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 17:13
 */
@Getter @Setter
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postContruct() {
        System.out.println("Objeto foi criado.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto foi finalizado");
    }
}
