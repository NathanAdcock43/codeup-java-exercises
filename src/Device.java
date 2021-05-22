

public abstract class Device implements TextEditor{
//   Setup: Create a "class named Device" inside of src.

//    1) The class should define 3 instance properties.
//    Two instance properties for type and brand they should be a String.
//    One instance property for price it should be a Double.
//    These properties should not be accessible outside of the Device class.

    private String type;
    private String brand;
    private Double price;

//    2) Create a constructor method that takes in two strings, and a double,
//    and sets the brand, type, and price properties based on the passed arguments.
//    Exception- Inside the constructor, if either of the passed brand or "type arguments are null",
//    or "if the passed price is 0", the constructor should throw an IllegalArgumentException.

    public Device(String type, String brand, Double price) {
        if (type == null || brand == null || price == 0) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

//    3) Create a getter and setter for each property of the class.


    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    Extended from Question 4
//    2)Change your Device class so that it implements the TextEditor interface.

//    Done (up top)

//    The implementation of the openTextFile method on Device class should return a String with this message:
//    Opening $FILE with $EDITOR
//    Replace $FILE with the name of the file that was passed to the method.
//    $EDITOR should be replaced with either TextEdit or Notepad. Use the value of the instance property brand
//    to replace $EDITOR with either TextEdit if brand is equals to Apple or Notepad if brand is equals to Microsoft.
//    Hint: An example of the returned string if the brand is Microsoft might look like this:
//          I.E.  Opening contacts.txt with Notepad

    public String openTextFile (String filename) {
        if (this.brand.equals("Apple")) {
            return "\n  Opening " + filename + "with TextEdit";
        }else if(this.brand.equals("Microsoft")){
            return "\n  Opening " + filename + "with Notepad";
        }else {
            return "\n  Opening " + filename + "with whatever we can find";
        }
    }

//

}
