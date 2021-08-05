package pl.tuminski.crm.businessopportunity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.tuminski.crm.client.ClientRepository;
import pl.tuminski.crm.machine.Machine;
import pl.tuminski.crm.machine.MachineRepository;
import pl.tuminski.crm.salesman.SalesmanRepository;

@Controller
@RequestMapping("/bo")
public class BoController {

    private final BoRepository boRepository;
    private final ClientRepository clientRepository;
    private final MachineRepository machineRepository;
    private final SalesmanRepository salesmanRepository;

    public BoController(BoRepository boRepository, ClientRepository clientRepository, MachineRepository machineRepository, SalesmanRepository salesmanRepository) {
        this.boRepository = boRepository;
        this.clientRepository = clientRepository;
        this.machineRepository = machineRepository;
        this.salesmanRepository = salesmanRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String boAdd(){
        BusinessOpportunity businessOpportunity = new BusinessOpportunity();
        businessOpportunity.setValue(3000);
        businessOpportunity.setClient(clientRepository.findClientById(1L));
        businessOpportunity.setMachine(machineRepository.findMachineById(1L));
        businessOpportunity.setSalesman(salesmanRepository.findSalesmanById(1L));
        boRepository.save(businessOpportunity);
        return "Business opportunity added";
    }
}
