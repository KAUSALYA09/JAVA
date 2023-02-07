public class StrBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("String Buffer"); // created a StringBuffer class
        System.out.println(sb);

        sb.append(" Class"); // concatenates 2 strings
        System.out.println(sb);

        sb.insert(0,"Strings,"); //inserted a string at the specified index position
        System.out.println(sb);

        sb.replace(22,25, ",String Builder"); // replaced a string at the specified index position
        System.out.println(sb);

        sb.delete(22,40); // deleted a sequence of char at the specified index position
        System.out.println(sb);

        sb.reverse(); // reverse a given string
        System.out.println(sb);

        System.out.println(sb.capacity()); // capacity of a string in StringBuffer. Initial capacity is 16.

    }
}
