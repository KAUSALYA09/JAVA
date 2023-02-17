//Multilevel inheritance
class Catarpillar{
    void cycle(){
        System.out.println("Caterpillar turns into a butterfly");
    }
}
class Egg extends Catarpillar{
    void print(){
        System.out.println("Eggs-Second stage of life cycle");
    }
}
class Larva extends Egg{
    void display(){
        System.out.println("Larva-Third stage of life cycle");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Larva three=new Larva();
        three.cycle();
        three.print();
        three.display();

    }
}
