import java.util.ArrayList;
import java.util.HashMap;

public class Assessment {
// Setup: On your "Assessment class" file inside of the src directory.

// 1) cube: Write a public static method named cube that accepts an integer as input and returns that number 3 times itself.

    public static int cube (int num){
        return num * num * num;
    }

// 2) difference: Write a public static method named difference that accepts two arguments and returns the absolute value of
// the difference between them such that the answer is always a positive number. The method should work with both integers and doubles.



    public static int difference (int num1, int num2){
        if (num1 >= num2 ){
            return num1-num2;
        }else{
            return num2-num1;
        }
    }

    public static double difference (double num1, double num2){
        if (num1 >= num2 ){
            return num1-num2;
        }else{
            return num2-num1;
        }
    }

    //Hints
    //The difference of 6 and 8 is 2
    //The difference of -2 and 5 is 7
    //The difference of 1.4 and 2.5 is 1.1
    //Using method overloading will help to solve this problem



// 3) average: Write a public static method named average that takes in an Array of integers (not a List, an Array) and
// returns the average of all the numbers in the list as a Double.


    public static double average (int[] nums){
        double bucket = 0;
        for (int num : nums){
            bucket = bucket + num;
        }
        return bucket;
    }

    //Hint: A good test is making sure the average of [1, 2] is 1.5




//    Setup: Create a static method named createInventory on the Assessment class.
//
//    Question 5) This class should take in an "ArrayList of Device objects" and return a "HashMap<String, Device>".
//
//    The "keys of the returned HashMap" should be a automatically generated "serial number". A serial number
//    is a string that "starts with an 'S'," and "a number that starts with 0 and increments" for each Device.
//    he values in the HashMap are the Device instances themselves.


    public  static HashMap<String, Device> createInventory (ArrayList<Device> inventory){
        HashMap<String, Device> serialNumberList = new HashMap<String, Device>();
        int counter = 0;
        for(Device item : inventory){
            serialNumberList.put("S"+ counter++ , item);
        }
        return serialNumberList;
    }

//
//    For example:
//
//    The first Device in the list should have the serial number S0
//    The third Device in the list should have the serial number S2
//    The purpose of the serial number as a key in a HashMap is to be able to find devices like this:
//
//    HashMap<String, Device> inventory = Assessment.createInventory(devices);
//    inventory.get("S0"); // this line should return the first Device object




//    Setup: On your Assessment class create a static method named blackFridaySale.
//
//    Question 6) This method should:
//    Take in an "ArrayList of Device objects"
//    The method should "return an ArrayList of Device objects" where each device's price is lowered with a discount based on the following rules:
//    If the device brand is Apple it gets a 5% off on the normal price.
//    If the device brand is Microsoft it gets a 7% off on the normal price;

    public static ArrayList<Device> blackFridaySale(ArrayList<Device> inventory) {
        ArrayList<Device> discountedInventory = new ArrayList<>();
        for (Device item : inventory) {
            if (item.getBrand().equals("Apple")) {
               double discountedItem = item.getPrice() * .05;
               item.setPrice(discountedItem);
                discountedInventory.add(item);
            } else if (item.getBrand().equals("Microsoft")) {
                double discountedItem = item.getPrice() * .05;
                item.setPrice(discountedItem);
                discountedInventory.add(item);
            } else {
                discountedInventory.add(item);
            }
        }
        return discountedInventory;
    }
}
