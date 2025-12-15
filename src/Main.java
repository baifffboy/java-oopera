import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Name1", "Surname1", 23, Gender.MALE); // 1 пункт
        Actor actor2 = new Actor("Name2", "Surname2", 24, Gender.FEMALE);
        Actor actor3 = new Actor("Name3", "Surname3", 25, Gender.MALE);
        Director director1 = new Director("Name4", "Surname4", 5, Gender.FEMALE);
        Director director2 = new Director("Name5", "Surname5", 7, Gender.MALE);

        MusicalShow show = new MusicalShow("title1", 230, director2, new ArrayList<Actor>(),
                new Person("Name4", "Surname4", Gender.FEMALE), "librettoText1"); // 2 пункт
        Opera opera = new Opera("title2", 245, director1, new ArrayList<Actor>(),
                new Person("Name5", "Surname5", Gender.MALE), "librettoText2", 30);
        Ballet ballet = new Ballet("title2", 245, director1, new ArrayList<Actor>(),
                new Person("Name6", "Surname6", Gender.FEMALE), "librettoText3",
                new Person("Name7", "Surname7", Gender.FEMALE));

        show.addActor(actor1); // 3 пункт
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Список актеров перед заменой:");
        show.printActors(); // 4 пункт
        ballet.printActors();
        opera.printActors();
        System.out.println("\n");

        ballet.replaceActor(actor2, actor1.getSurname()); // 5 пункт

        System.out.println("Список актеров после замены:");
        show.printActors();
        ballet.printActors();
        opera.printActors();
        System.out.println("\n");

        show.replaceActor(actor3, actor3.getSurname()); // 6 пункт
        System.out.println("\n");

        opera.printLibretto(); // 7 пункт
        ballet.printLibretto();
    }
}
