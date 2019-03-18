package sea.transport;

public class Yacht extends Sailboat {
    public Yacht(String name, String size, int price, int sails) {
        super(name, size, price, sails);
    }

    public void drive(){
        System.out.println("яхта едет");
    }

    public void turnLeft(){
        System.out.println("яхта повернула налево");
    }
}
