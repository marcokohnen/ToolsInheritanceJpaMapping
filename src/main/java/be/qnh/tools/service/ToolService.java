package be.qnh.tools.service;

import be.qnh.tools.domain.DrillingMachine;
import be.qnh.tools.domain.Hamer;

public interface ToolService {

    Iterable<Hamer> findAllHammers();

    Iterable<DrillingMachine> findAllDrillingMachines();


    Iterable<Hamer> findHamerByNameLike(String name);

    Iterable<DrillingMachine> findDrillingMachineByNameLike(String name);

    Iterable<Hamer> findHammerByElectric(boolean electric);

    Iterable<DrillingMachine> findDrillingMachineByElectric(boolean electric);

    Iterable<Hamer> findHamerByWeightGreaterThan(double weight);
}
