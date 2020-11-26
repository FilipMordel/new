package atrybuty_02;

public class Person {
    public String name = "Halinka";
    public String surname = "Kowalska";
    private int age = 18;
    public char gender = 'F';

    public String toString(){
        return "Imię: " + name + ",\n Nazwisko: " + surname +
                ",\n wiek: " + age + ",\n płeć: " + gender;


    }
}
