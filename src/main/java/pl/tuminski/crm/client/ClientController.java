package pl.tuminski.crm.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String clientAdd(){
        Client client = new Client();
        client.setAddress("address1");
        client.setEmail("mail1");
        client.setName("name1");
        client.setNIP("NIP1");
        client.setPhone("phone1");
        client.setRegion("region1");
        clientRepository.save(client);
        return "client added";
    }
}
