
public class Person {
    public static void main(String[] args) {

        Person nathan = new Person();
        nathan.name = "Nathan";
        System.out.println(nathan.getName());


    }
    private String name;

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println(name);
    }
}