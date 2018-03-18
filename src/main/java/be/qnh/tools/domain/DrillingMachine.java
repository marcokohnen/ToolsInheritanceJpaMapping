package be.qnh.tools.domain;

import javax.persistence.Entity;

@Entity
public class DrillingMachine extends Tool {

    private String function;

    public DrillingMachine() {
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return super.toString() +  "DrillingMachine{" +
                "function='" + function + '\'' +
                '}';
    }
}
