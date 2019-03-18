package land.transport;

import com.transport.Transport;

public abstract class Land extends Transport {
    private int wheel;

    public Land (String name, String size, int price, int wheel) {
        super(name, size, price);
        this.wheel = wheel;
    }

    public void setWheel(int wheel){
        this.wheel = wheel;
    }

    public int getWheel(){
        return wheel;
    }

}
