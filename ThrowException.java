public class ThrowException {
        void validate(int age) {
            if(age<18){
                throw new ArithmeticException("Not eligible");
            }
            else{
                System.out.println("eligible");
        }
    }

    public static void main(String[] args) {
        ThrowException ob = new ThrowException();
        ob.validate(13);
    }
}
