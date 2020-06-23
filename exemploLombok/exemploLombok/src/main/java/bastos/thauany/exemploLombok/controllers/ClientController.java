package bastos.thauany.exemploLombok.controllers;

import bastos.thauany.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 15:50
 */
@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Thauany");
        client.setLastName("Bastos");
        client.setAge(19);

        Client client1 = new Client();
        client1.setName("João");
        client1.setLastName("Oliveira");
        client1.setAge(20);

        clients.add(client);
        clients.add(client1);

        return clients;
    }

}
