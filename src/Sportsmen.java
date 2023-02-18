import java.time.LocalDate;

public abstract class Sportsmen implements Sport{

    private String name;
    private String LastName;
    private LocalDate dataOfBirth;
    private double height;
    private double weight;



    public Sportsmen(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public Sportsmen(String name, String lastName, LocalDate dataOfBirth, double height, double weight) {
        this.name = name;
        LastName = lastName;
        this.dataOfBirth = dataOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name +
                ", LastName='" + LastName +
                ", dataOfBirth=" + dataOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

