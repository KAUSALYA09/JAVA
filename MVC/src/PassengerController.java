public class PassengerController {

    private Passenger model;
    private PassengerView view;

    public PassengerController(Passenger model, PassengerView view) {
        this.model=model;
        this.view=view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public String getName(){
        return model.getName();
    }

    public void setAge(int age){
        model.setAge(age);
    }

    public int getAge(){
        return model.getAge();
    }

    public void setGender(char gender){
        model.setGender(gender);
    }

    public char getGender(){
        return model.getGender();
    }

    public void updateView(){
        view.printPassengerDetails(model.getName(), model.getAge(), model.getGender());
    }
}
