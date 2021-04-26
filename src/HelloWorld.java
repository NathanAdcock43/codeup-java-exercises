public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello!");
        System.out.println(" It's a mad World!");

        byte myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

        String myString = "I am a string!";
        System.out.println(myString);

        char myChar =  'p';
        System.out.println(myChar);

        long myNumber = 20;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);

        myNumber = 125;
        System.out.println(myNumber);

        long three = 3000;
        short three2 = (short) three;
        System.out.println(three2);

        int x = 4;
        x += 5;
        System.out.println(x);

        int n = 3;
        int y = 4;
        y *= n;
        System.out.println(y);

        int w = 10;
        int z = 2;
        w /= z;
        z -= w;
        System.out.println(z);

        byte num = 127;
        num += num;
        num *= 3;
        System.out.println(num);
    }
}
