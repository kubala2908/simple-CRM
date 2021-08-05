package pl.tuminski.crm.businessopportunity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.tuminski.crm.machine.Machine;

@Controller
@RequestMapping("/bo")
public class BoController {

    private final BoRepository boRepository;

    public BoController(BoRepository boRepository) {
        this.boRepository = boRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String boAdd(){
        return "Business opportunity added";
    }
}
