//Multiple inheritance
interface Branch{
    void print();
}
interface Location{
    void display();
}
class Institution implements Branch,Location{
    public void print(){
        System.out.println("Full Creative");
    }
    public void display(){
        System.out.println("Chennai");
    }
}
public class Multiple{
    public static void main(String[] args) {
        Institution place = new Institution();
        place.display();
        place.print();
    }
}












