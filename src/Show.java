import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актеры спектакля:");
        for (Actor i : listOfActors) {
            System.out.println(i);
        }
    }

    public void addActor (Actor actor) {
        for (Actor i : listOfActors) {
            if (actor.equals(i)) {
                System.out.println("Данный актёр уже есть в списке!");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor (Actor actor, String surname) {
        boolean isThere = false;
        for (Actor i : listOfActors) {
            if (surname.equals(i.surname)) {
                listOfActors.remove(i);
                isThere = true;
            }
        }
        if (!isThere) {
            System.out.println("Данного актёра нет в списке!");
            return;
        }
        addActor(actor);
    }
}
