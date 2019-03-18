package land.transport;

public class Paxcar extends Car{
    public Paxcar(String name, String size, int price, int wheel) {
        super(name, size, price, wheel);
    }

    public void drive(){
        System.out.println("машина едет");
    }

    public void turnLeft(){
        System.out.println("повернули налево");
    }
}

