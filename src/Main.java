import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[]args) {
        ;

        Trainer trainer = new Trainer("Ulan", "Kubanycbekov");
        LocalDate.of(1990, 1, 03);

        Sportsmen[] sportsmen = {new Attack("Temirlan","Juzukulov",
                LocalDate.of(2004,4,02),2,4),
                new Defender("Sanjar","Abdymomunov",
                LocalDate.of(2006,5,3),8,6),
                new Goalkeeper("Abdymomun","Akunov",
                LocalDate.of(2005,3,1),8,6)};

           myMethod(sportsmen);
        System.out.println("Year" + Period.between(trainer.getDataOfBirth(),LocalDate.now()).getYears()
                +trainer.getName()+ trainer.getLastName());

    }
    public static void myMethod(Sportsmen[] sportsmen){
        for (Sportsmen s:sportsmen) {
            System.out.println("Year " + Period.between(s.getDataOfBirth(),LocalDate.now()).getYears()+" "+s);



        }
    }



    }










