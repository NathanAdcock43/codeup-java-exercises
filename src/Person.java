
public class Person {
    public static void main(String[] args) {

        Person nathan = new Person();
        nathan.name = "Nathan";
        System.out.println(nathan.getName());
        System.out.println(nathan.setName("Nate"));

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

    public String sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println(this.name);
        return this.name;
    }
}