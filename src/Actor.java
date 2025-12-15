import java.util.ArrayList;
import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.getName() +
                " " + super.getSurname() +
                " (" + height +
                ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return ((height == actor.height) && (super.getName().equals(actor.getName())) && (super.getSurname().equals(actor.getSurname())));
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (super.getName() != null) {
            hash = hash + super.getName().hashCode();
        }
        hash = hash * 31;

        if (super.getSurname() != null) {
            hash = hash + super.getSurname().hashCode();
        }
        hash = hash * 31;

        hash = hash + height;

        return hash;
    }
}
