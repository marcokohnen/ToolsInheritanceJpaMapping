package be.qnh.tools.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


//@MappedSuperclass : zorgt ervoor dat deze abstracte klasse geen entity wordt en er per subklasse een aparte repository
//                    moet worden gemaakt die extenden van de AbstracteToolRepository<T extends Tool>

//@Entity : zorgt ervoor dat deze abstracte klasse een entity wordt en er per subklasse geen aparte repository
//          moet worden gemaakt die extenden van de AbstracteToolRepository maar alleen de
//          AbstracteToolRepository<T extends Tool> nodig is

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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

