 class Poly {
    String shape = "Rectangle";
    int length;
    int width;

    int find(int length, int width) {
        this.length = length;
        this.width = width;
        return (length * width);
    }

    int find(int a, int length, int width) {
        return (a + length + width);
    }
}

class OverLoad {
    public static void main(String[] args) {
        Poly load =new Poly();
        System.out.println(load.shape);
        System.out.println("Area-"+load.find(5,6));
        System.out.println("Perimeter-"+load.find(2,5,6));

    }

}
