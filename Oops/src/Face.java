//using interface
class Face implements Inter {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void substraction(int c, int d) {
        System.out.println(c - d);
    }

    public void multiplication(int e, int f) {
        System.out.println(e * f);
    }

    public static void main(String[] args) {
        Inter solve = new Face();
        solve.sum(2,3);
        solve.substraction(100,30);
        solve.multiplication(4,5);
    }
}

