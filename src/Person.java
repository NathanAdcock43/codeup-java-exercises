
public class Person {
    public static void main(String[] args) {

        Person nathan = new Person();
        nathan.name = "Nathan";
        System.out.println(nathan.getName());
        System.out.println(nathan.setName("Nate"));
        nathan.sayHello();

        Person person1 = new Person();
        Person person2 = person1;
        person1.name = "John";
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
    private String name;

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public String setName(String name) {
//TODO: change the name property to the passed value
       this.name = name;
       return name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }


}