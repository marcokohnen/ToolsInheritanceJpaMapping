package be.qnh.tools.domain;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ToolPredicates {

//    public static Predicate<Hamer> isHeavierThan(double weight) {
//        return hamer -> hamer.getWeight() > weight;
//    }

    public static Predicate<Tool> hasWeightGreaterThan(double weight) {
        return tool -> tool.getWeight() > weight;
    }

    public static Predicate<Tool> isElectric (boolean electric) {
        return Tool::isElectric;
    }

    public static List<? extends Tool> filterTools(List<? extends Tool> tools, Predicate<Tool> toolPredicate) {
        return tools.stream().filter(toolPredicate).collect(Collectors.<Tool>toList());
    }

//    public static List<Hamer> filterHammers(List<Hamer> hamers, Predicate<Hamer> hamerPredicate) {
//        return hamers.stream().filter(hamerPredicate).collect(Collectors.<Hamer>toList());
//    }
}
