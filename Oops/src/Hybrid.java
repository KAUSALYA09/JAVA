//Hybrid inheritance
class Cater{
    void cycle(){
        System.out.println("Caterpillar turns into a butterfly");
    }
}
class Pupaa extends Catar{
    void print(){
        System.out.println("Pupa-fourth stage of life cycle");
    }
}
class Adulthood extends Catar{
    void display(){
        System.out.println("Adult-fifth stage of life cycle");
    }
}
class Butterfly extends Adulthood{
    void end(){
        System.out.println("Butterfly-Final stage of life cycle");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Butterfly live = new Butterfly();
        live.end();
        live.display();
        live.cycle();
    }

}
