package metody_03;

public class Person {
    private String name = "Tomek"  ;
    private String surname = "Kowalski";
    private int age = 18;
    private char gender = 'M';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
   public String toString() {
       return " Imię: " + name + ",\n Nazwisko: " + surname +
               ",\n wiek: " + age + ",\n płeć: " + gender;

   }
   public void increasAge(){
        this.age++;
   }
}
