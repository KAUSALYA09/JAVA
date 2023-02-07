public class StrBuilder {
        public static void main(String[] args) {

            StringBuilder bd = new StringBuilder("String Builder"); // created a StringBuilder class
            System.out.println(bd);

            bd.append(" is mutable"); // concatenates 2 strings
            System.out.println(bd);

            bd.insert(25,"String,"); //inserted a string at the specified index position
            System.out.println(bd);

            bd.replace(26,30, ",and efficient in java"); // replaced a string at the specified index position
            System.out.println(bd);

            bd.delete(40,50); // deleted a sequence of char at the specified index position
            System.out.println(bd);

            bd.reverse(); // reverse a given string
            System.out.println(bd);

            System.out.println(bd.capacity()); // capacity of a string in StringBuffer. Initial capacity is 16.

        }
}


