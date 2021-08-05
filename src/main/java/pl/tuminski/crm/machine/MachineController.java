package pl.tuminski.crm.machine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/machine")
public class MachineController {

    private final MachineRepository machineRepository;

    public MachineController(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String machineAdd(){
        Machine machine = new Machine();
        machine.setProducer("Producer1");
        machine.setModel("Model1");
        machine.setPrice(200000);
        machineRepository.save(machine);
        return "added machine";
    }


}
