 class Encaps {
    private String parts;
    private int wheels;
    private float distance;

    private float base;
    private float height;

    public String getParts() {
        return parts;
    }
    public void setParts(String parts) {
        this.parts = parts;
    }
    public int getwheels(){
        return wheels;
    }
    public void setWheels(int wheels){
        this.wheels=wheels;
    }
    public float getDistance(){
        return distance;
    }
    public void setDistance(float distance){
        this.distance=distance;
    }
    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base=base;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height=height;
    }

    void solution(float base,float height){
        System.out.println("Encapsulation");
        System.out.println((0.5*base*height));
    }
}
class Encap{
    public static void main(String[] args) {
        Encaps test = new Encaps();
        test.setParts("Steering");
        test.setWheels(6);
        test.setDistance(52.8f);
        test.setBase(4.5f);
        test.setHeight(6.9f);
        System.out.println(test.getParts()+"\n"+test.getwheels()+"\n"+test.getDistance()+"\n"+test.getBase()+"\n"+test.getBase()+"\n"+test.getHeight());
        test.solution(test.getBase(), test.getHeight());

    }
}
