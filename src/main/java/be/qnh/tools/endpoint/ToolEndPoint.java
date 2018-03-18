package be.qnh.tools.endpoint;

import be.qnh.tools.domain.DrillingMachine;
import be.qnh.tools.domain.Hamer;
import be.qnh.tools.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tools")
public class ToolEndPoint {

    private final ToolService toolService;

    @Autowired
    public ToolEndPoint(ToolService toolService) {
        this.toolService = toolService;
    }

    @RequestMapping(value = "hammers/findall", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Hamer>> findAllHammers() {
        return new ResponseEntity<>(toolService.findAllHammers(), HttpStatus.OK);
    }

    @RequestMapping(value = "drillingmachines/findall", method = RequestMethod.GET)
    public ResponseEntity<Iterable<DrillingMachine>> findAllDrillingMachines() {
        return new ResponseEntity<>(toolService.findAllDrillingMachines(), HttpStatus.OK);
    }

    @RequestMapping(value = "hammers/{name}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Hamer>> findHamerByNameLike(@PathVariable String name) {
        return new ResponseEntity<>(toolService.findHamerByNameLike(name), HttpStatus.OK);
    }

    @RequestMapping(value = "drillings/{name}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<DrillingMachine>> findDrillingMachineByNameLike(@PathVariable String name) {
        name =  "%" + name + "%";
        return new ResponseEntity<>(toolService.findDrillingMachineByNameLike(name), HttpStatus.OK);
    }

    @RequestMapping(value = "hammerselectric/{electric}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Hamer>> findHamerByElectric(@PathVariable boolean electric) {
        return  new ResponseEntity<>(toolService.findHammerByElectric(electric), HttpStatus.OK);
    }

    @RequestMapping(value = "drillingselectric/{electric}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<DrillingMachine>> findDrillingByElectric(@PathVariable boolean electric) {
        return  new ResponseEntity<>(toolService.findDrillingMachineByElectric(electric), HttpStatus.OK);
    }
}
