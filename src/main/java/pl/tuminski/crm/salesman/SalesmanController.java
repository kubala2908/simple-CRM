package pl.tuminski.crm.salesman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.tuminski.crm.machine.Machine;

@Controller
@RequestMapping("/salesman")
public class SalesmanController {

    public final SalesmanRepository salesmanRepository;

    public SalesmanController(SalesmanRepository salesmanRepository) {
        this.salesmanRepository = salesmanRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String salesmanAdd(){
        Salesman salesman = new Salesman();
        salesman.setName("salesman1");
        salesman.setEmail("email1");
        salesman.setPhone("phone1");
        salesman.setRegion("region1");
        return "salesman added";
    }
}
