package pl.tuminski.crm.salesman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.tuminski.crm.machine.Machine;

import java.util.List;

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
        salesmanRepository.save(salesman);
        return "salesman added";
    }

    @GetMapping("/potential")
    public String salesmanPotentialProfit(Model model){
        List<Salesman> salesmanList = salesmanRepository.findAll();
        model.addAttribute("salesmen", salesmanList);
        model.addAttribute("salesman", new Salesman());
        return "potentialProfitView";
    }

    @PostMapping("/potential")
    @ResponseBody
    public String salesmanPotentialProfitPost(@RequestParam Long idSalesman){
        return "The possible profit of the selected salesman is: " + String.valueOf(salesmanRepository.sumValueWhereId(idSalesman));
    }
}
