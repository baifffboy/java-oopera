public class Director extends Person {
    int numberOfShows;

    Director (String name, String surname, int numberOfShows, Gender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void printDirector() {
        System.out.println(this);
    }
}
