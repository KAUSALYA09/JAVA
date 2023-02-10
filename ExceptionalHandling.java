public class ExceptionalHandling {

    public static void main(String[] args) {
        System.out.println("Exception Handling");
        try {
            try {
                String name = null;
                System.out.println(name.length());
            }catch(Exception exp){
                System.out.println("Exception 1 - " + exp);
            }
            try {
                int arr[] = {1, 2, 3, 4, 5};
                System.out.println(arr[5]);
                int a = arr[2]/0 ;
            } catch (ArrayIndexOutOfBoundsException ioe) {
                System.out.println("Exception 2 - " +ioe);
            } catch (ArithmeticException aie) {
                System.out.println("Exception 3 array-" + aie);
            }
            catch (Exception ex){
                System.out.println("Exception 4 - " + ex);
            }


            try {
                int number, number1, number2;
                number = 100;
                number1 = 0;
                number2 = number / number1;
                System.out.println(number2);
            } catch (ArithmeticException ae) {
                System.out.println("Exception 5 - " + ae);
                System.out.println("a number cannot be divided by zero");
            }
        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("End of the code");
        }
    }
}