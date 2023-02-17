//Hierarchical inheritance
class Catar{
    void cycle(){
        System.out.println("Caterpillar turns into a butterfly");
    }
}
class Pupa extends Catar{
    void print(){
        System.out.println("Pupa-fourth stage of life cycle");
    }
}
class Adult extends Catar{
    void display(){
        System.out.println("Adult-fifth stage of life cycle");
    }
}
public class Hierarchy {
    public static void main(String[] args) {
        Adult stage = new Adult();
        stage.display();
        stage.cycle();
    }

}
