package be.qnh.tools.domain;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Tool extends AbstractEntity implements Serializable {

    private String name;
    private double weight;
    private boolean electric;

    public Tool() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", electric=" + electric +
                '}';
    }
}

