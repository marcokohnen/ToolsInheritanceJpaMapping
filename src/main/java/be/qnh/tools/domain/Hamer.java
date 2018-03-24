package be.qnh.tools.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.Entity;

@Entity
public class Hamer extends Tool implements Comparable<Hamer>{

    private static final Logger LOGGER  = LogManager.getLogger(Hamer.class);

    private String function;

    public Hamer() {
        LOGGER.error("Error message : Constructed Hamer Object");
        LOGGER.debug("Debug message : Constructed Hamer Object");
        LOGGER.info("Info message : Constructed Hamer Object");
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return super.toString() + "Hamer{" +
                "function='" + function + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hamer)) return false;
        Hamer hamer = (Hamer) o;
        System.out.println("Entered method equals of class Hamer");
        return this.getName().equals(hamer.getName());
    }

    @Override
    public int hashCode() {
        int result = 0;
        int factor = 0;
        for (char c : this.getName().toCharArray()) {
            factor++;
            result = result + (c * factor);
            System.out.println("result = " + result + ", char = " + c);
        }
        System.out.println("hashCode = " + result);
        return result;
    }

    @Override
    public int compareTo(Hamer hamer) {
        return this.getName().compareTo(hamer.getName());
    }
}
