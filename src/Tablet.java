
//    Setup: Create a "class named Tablet" that "inherits from Device".
public class Tablet extends Device {

//    1) Add a "protected instance property" named "physicalKeyboard" that is a boolean.
//    This property represents whether an instance of this class has a physical keyboard.

    protected Boolean physicalKeyboard;


//    2) Write the "constructor on Tablet" that defines 4 parameters: the "brand" of that device, the "type", the "price", and a boolean indicating whether that
//    device has a "keyboard". The corresponding properties of the object should be set based on the arguments passed to the constructor.

    public Tablet(String type, String brand, Double price, Boolean physicalKeyboard) {
        super(type, brand, price);
        this.physicalKeyboard = physicalKeyboard;
    }

//    3) Write an "instance method" on the Tablet class "named hasPhysicalKeyboard"
//    that returns a boolean indicating whether the tablet has a keyboard,
//    based on the physicalKeyboard property.

    public Boolean hasPhysicalKeyboard(){
        return this.physicalKeyboard;
    }


}
