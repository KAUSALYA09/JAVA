import java.sql.SQLOutput;

public class Strings {
    public static void main(String args[]){

        //different ways to create a string
        String sr="kausalya";
        System.out.println("Name = "+ sr);

        String s1 = new String(" Full Stack Developer ");
        System.out.println("Position = " + s1);

        char[] ch ={'F','u','l','l','C','r','e','a','t','i','v','e'};
        String s = new String(ch);
        System.out.println("Company name = "+ s);


        //some of the methods in string
        System.out.println("Length of a name -" + sr.length());
        System.out.println("Length of a position - " + s1.length());
        System.out.println("Length of a Company name - " + s.length());

        char c = s.charAt(1);
        System.out.println("1st index position of FullCreative is :" + c);

        System.out.println(s.substring(4)); // prints from the 4th position
        System.out.println(s1.substring(4,10)); // prints the substring from 4th index to 9th index
        System.out.println(s1.toLowerCase()); // converts into lowercase
        System.out.println(sr.toUpperCase()); // converts into uppercase
        System.out.println(s1.trim()); // trim out the white spaces


    }
}
