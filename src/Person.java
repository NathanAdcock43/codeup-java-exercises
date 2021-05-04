
public class Person {
    public static void main(String[] args) {

        Person nathan = new Person();
        nathan.name = "Nathan";
        nathan.getName();
        nathan.setName("Nate");
        nathan.sayHello();

        Person person1 = new Person();
        Person person2 = person1;
        person1.name = "John";
        person1.getName();
        person2.getName();
        person2.setName("Jane");
        person1.getName();
        person2.getName();
    }
    private String name;

    public void getName() {
//TODO: return the person's name
        System.out.println(name);
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
       this.name = name;
        System.out.println(this.name);
    }
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }


}