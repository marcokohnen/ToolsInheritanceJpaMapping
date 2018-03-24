package be.qnh.tools;

import be.qnh.tools.domain.GenericsDemo;
import be.qnh.tools.domain.Hamer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

import static be.qnh.tools.domain.ToolPredicates.filterTools;
import static be.qnh.tools.domain.ToolPredicates.hasWeightGreaterThan;
import static be.qnh.tools.domain.ToolPredicates.isElectric;

@SpringBootApplication
public class ToolsApplication {

	public static void main(String[] args) {
        SpringApplication.run(ToolsApplication.class, args);

        Hamer h1 = new Hamer();
        h1.setName("Hamer1");
        h1.setWeight(2.5);
        h1.setElectric(true);
        Hamer h2 = new Hamer();
        h2.setName("Hamer2");
        h2.setWeight(2.9);
        h2.setElectric(true);
        Hamer h3 = new Hamer();
        h3.setName("Hamer3");
        h3.setWeight(5.5);
        h3.setElectric(false);
        Hamer h4 = new Hamer();
        h4.setName("Hamer4");
        h4.setWeight(9.4);
        h4.setElectric(false);
        Hamer h5 = new Hamer();
        h5.setName("Hamer5");
        h5.setWeight(12.5);
        h5.setElectric(true);

        List<Hamer> hamersList = new ArrayList<>(Arrays.asList(h1, h2, h3, h4, h5));
        Set<Hamer> hamers = new HashSet<>(hamersList);

        System.out.println(filterTools(hamersList, hasWeightGreaterThan(9.0)));

        filterTools(hamersList, hasWeightGreaterThan(10.0)).forEach(System.out::println);
        System.out.println();
        filterTools(hamersList, isElectric(true)).forEach(System.out::println);

        Hamer h5Copy = new Hamer();
        h5Copy.setName("Hamer5");

        System.out.println("h5.equals(h5Copy) = " + h5.equals(h5Copy));

        System.out.println("hamers.add(h5Copy) = " + hamers.add(h5Copy));
        hamers.forEach(System.out::println);


//        GenericsDemo<Object> stringGenericsDemo = new GenericsDemo<>();
//        stringGenericsDemo.setT("Generics");
//        System.out.println(stringGenericsDemo.getT());
    }
}
