package be.qnh.tools.service;

import be.qnh.tools.domain.DrillingMachine;
import be.qnh.tools.domain.Hamer;
import be.qnh.tools.domain.Tool;
import be.qnh.tools.repository.DrillingMachineRepository;
import be.qnh.tools.repository.HammerRepository;
import be.qnh.tools.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

import static javafx.scene.input.KeyCode.T;

@Service
public class ToolServiceImpl implements ToolService {

    private final HammerRepository hammerRepository;
    private final DrillingMachineRepository drillingMachineRepository;

    @Autowired
    public ToolServiceImpl(HammerRepository hammerRepository, DrillingMachineRepository drillingMachineRepository) {
        this.hammerRepository = hammerRepository;
        this.drillingMachineRepository = drillingMachineRepository;
    }

    @PostConstruct
    private void init() {
        Hamer hamer1 = new Hamer();
        hamer1.setName("Hammer1");
        hamer1.setFunction("Hammering");
        hamer1.setElectric(false);
        Hamer hamer2 = new Hamer();
        hamer2.setName("Hammer2");
        hamer2.setFunction("Hammering");
        hamer2.setElectric(true);
        Hamer hamer3 = new Hamer();
        hamer3.setName("Hammer3");
        hamer3.setFunction("Hammering");
        hamer3.setElectric(false);
        hammerRepository.saveAll(Arrays.asList(hamer1, hamer2, hamer3));

        DrillingMachine drillingMachine1 = new DrillingMachine();
        drillingMachine1.setName("DrillingMachine1");
        drillingMachine1.setElectric(true);
        drillingMachine1.setFunction("Drilling");
        DrillingMachine drillingMachine2 = new DrillingMachine();
        drillingMachine2.setName("DrillingMachine2");
        drillingMachine2.setElectric(false);
        drillingMachine2.setFunction("Drilling");
        DrillingMachine drillingMachine3 = new DrillingMachine();
        drillingMachine3.setName("DrillingMachine3");
        drillingMachine3.setElectric(true);
        drillingMachine3.setFunction("Drilling");
        drillingMachineRepository.saveAll(Arrays.asList(drillingMachine1, drillingMachine2, drillingMachine3));

    }


    @Override
    public Iterable<Hamer> findAllHammers() {
        return hammerRepository.findAll();
    }

    @Override
    public Iterable<DrillingMachine> findAllDrillingMachines() {
        return drillingMachineRepository.findAll();
    }

    @Override
    public Iterable<Hamer> findHamerByNameLike(String name) {
        return hammerRepository.findByNameLike(name);
    }

    @Override
    public Iterable<DrillingMachine> findDrillingMachineByNameLike(String name) {
        return drillingMachineRepository.findByNameLike(name);
    }

    @Override
    public Iterable<Hamer> findHammerByElectric(boolean electric) {
        return hammerRepository.findByElectric(electric);
    }

    @Override
    public Iterable<DrillingMachine> findDrillingMachineByElectric(boolean electric) {
        return drillingMachineRepository.findByElectric(electric);
    }
}
