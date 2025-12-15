import java.util.ArrayList;
import java.util.Objects;

public class Actor extends Person {
    int height;

    Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name +
                " " + surname +
                " (" + height +
                ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return ((height == actor.height) && (name.equals(actor.name)) && (surname.equals(actor.surname)));
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash = hash * 31;

        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        hash = hash * 31;

        hash = hash + height;

        return hash;
    }
}
