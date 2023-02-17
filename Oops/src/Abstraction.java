abstract class Aircraft{
    abstract void types();
    void print(){
        System.out.println("Airplane");
    }
}

class Abstraction extends Aircraft{
        void types(){
            System.out.println("Helicopters");
        }

    public static void main(String[] args) {
        Aircraft air = new Abstraction();
        air.types();
        air.print();
    }
}

