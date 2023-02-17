//Object and class
class Features {
    String parts;
    int wheels;
    float distance;

    void display() {
        System.out.println("Object oriented programming language");
    }
}
class Calculation{
     String shape = "window";
     float base;
     float height;
     void calculate(float b,float h){
         base=b;
         height=h;

         System.out.println("Area of window-" + (0.5*base*height));
     }
}
    class Car{
        public static void main(String[] args) {
            Features obj = new Features();
            Calculation area = new Calculation();


            obj.display();
            System.out.println(obj.parts);
            obj.parts="Wheels";
            obj.wheels=4;
            obj.distance=60.2F;
            System.out.println("Part Name: " + obj.parts+"\n"+ "No. of wheels:"+obj.wheels+ "\n"+ "km/hr:"+obj.distance);

            area.calculate(5,6);

        }
    }
