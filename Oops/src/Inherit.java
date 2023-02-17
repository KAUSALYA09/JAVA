//Single Inheritance
class Caterpillar{
    void cycle(){
        System.out.println("Caterpillar turns into a butterfly");
    }
}
class Eggs extends Caterpillar{
    void print(){
        System.out.println("Second stage of life cycle");
    }
}

public class Inherit {
    public static void main(String[] args) {
         Eggs life=new Eggs();
         life.cycle();
         life.print();
    }
}
