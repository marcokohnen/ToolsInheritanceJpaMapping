package be.qnh.tools.domain;

import javax.persistence.Entity;

@Entity
public class Hamer extends Tool {

    private String function;

    public Hamer() {
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
}
