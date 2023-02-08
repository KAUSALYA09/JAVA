public class Data {

    public static void main(String[] args) {
        System.out.println("Primitive Datatypes:");
        byte small = 1;
        short least = 10;
        int defult = 100;
        long big = 10000000;
        float decimal = 2.5f;
        double number = 3.98765443;
        boolean yes = true;
        boolean no = false;
        char name = 'K';
        System.out.println("byte:" + small);
        System.out.println("short:" + least);
        System.out.println("int:" + defult);
        System.out.println("long:"+ big);
        System.out.println("float:" + decimal);
        System.out.println("double:" + number);
        System.out.println("boolean:" + yes);
        System.out.println("boolean:" + no);
        System.out.println("char:" + name);
        System.out.println("----------------------------------");

        System.out.println("non-primitive datatypes");

        String type="datatypes";
        System.out.println("String:" + type);

        int array[] = {10,23,45,67};
        String names[] = new String[4];
        names[0] = "ram";
        names[1] = "ravi";
        names[2] = "raj";
        names[3] = "red";


        for(int i=0; i < array.length ; i++){
            System.out.println("Array 1 -" + array[i]);
        }

        for(int j=0 ; j < names.length ; j++){
            System.out.println("Array 2 -" + names[j] );
        }



    }
}
