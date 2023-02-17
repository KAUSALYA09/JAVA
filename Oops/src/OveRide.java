//Method Overriding
class Ambulance{
    void message(){
        System.out.println("Emergency");
    }
}
class Driver extends Ambulance{
    void message(){
        System.out.println("Call 100 for emergency help");
    }
}
class Police extends Ambulance{}

class OveRide{
    public static void main(String[] args) {
        Driver call = new Driver();
        Ambulance run = new Police();//upcasting
        call.message();
        run.message();

    }
}











