public class Main {

    private static Passenger DetailsfromPassenger(){
        Passenger Passenger = new Passenger();
        Passenger.setName("Ram");
        Passenger.setAge(40);
        Passenger.setGender('M');
        return Passenger;
    }
    public static void main(String[] args) {
        Passenger model = DetailsfromPassenger();
        PassengerView view = new PassengerView();
        PassengerController controller = new PassengerController(model,view);

        controller.updateView();

        controller.setAge(30);
        System.out.println("After Updating:");

        controller.updateView();
    }
}
