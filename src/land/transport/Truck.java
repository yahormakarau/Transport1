package land.transport;

public class Truck extends Car {
    public Truck(String name, String size, int price, int wheel) {
        super(name, size, price, wheel);
    }

    public void drive(){
        System.out.println("трак едет");
    }

    public void turnLeft(){
        System.out.println("трак повернул налево");
    }
}
