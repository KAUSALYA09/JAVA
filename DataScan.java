import java.util.Scanner;
public class DataScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte small;
        short least;
        int count;
        long large;
        float read;
        double write;
        boolean logical;
        char letter;
        String word;
        String line;
        System.out.println("Enter a small 2 digit number");
        small = sc.nextByte();
        System.out.println("Enter a least digit between 1 to 9");
        least = sc.nextShort();
        System.out.println("Enter the total count of districts in Tamilnadu");
        count = sc.nextInt();
        System.out.println("Enter the largest digit between 1 to 9");
        large = sc.nextLong();
        System.out.println("Enter a decimal number");
        read = sc.nextFloat();
        System.out.println("Enter a decimal number");
        write = sc.nextDouble();
        System.out.println("True or false");
        logical = sc.nextBoolean();
        System.out.println("Enter a letter");
        letter = sc.next().charAt(0);
        System.out.println("Enter a word");
        word = sc.next();
        System.out.println("Enter a line");
        line = sc.nextLine();
        System.out.println("---------");


    }



}
