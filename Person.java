package zad5;

//Klasa Person
public class Person {
    private String nick;
    private int age;
    
    //Konstruktor
    public Person(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }
    
    //Gettery
    public String getNick() {
        return nick;
    }
    
    public int getAge() {
        return age;
    }
    
    //Nadpisanie metody toString()
    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
