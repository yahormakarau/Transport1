package land.transport;

public class Scooter extends Bike{

    public Scooter(String name, String size, int price, int wheel) {
            super(name, size, price, wheel);
        }

        public void drive(){
            System.out.println("Scooter едет");
        }

        public void turnLeft(){
            System.out.println(" Scooter повернул налево");
        }
}
