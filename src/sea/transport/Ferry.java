package sea.transport;

public class Ferry extends Steamship{
    public Ferry(String name, String size, int price, int sails) {
        super(name, size, price, sails);
    }

    public void drive(){
        System.out.println("паром едет");
    }

    public void turnLeft(){
        System.out.println("паром повернул налево");
    }
}
