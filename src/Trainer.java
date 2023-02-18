import java.time.LocalDate;

public class Trainer extends Sportsmen {


    public Trainer(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void name() {
        System.out.println("Ulan");
    }

    @Override
    public void LastName() {
        System.out.println("Kubanycbekov");

    }

    @Override
    public void height() {
        System.out.println("170");

    }

    @Override
    public void weight() {
        System.out.println("70");

    }

    @Override
    public void age() {
        System.out.println("30");

    }
}

