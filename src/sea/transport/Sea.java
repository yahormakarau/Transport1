package sea.transport;

import com.transport.Transport;

public abstract class Sea extends Transport {
    private int sails;

    public Sea(String name, String size, int price, int sails){
        super(name, size, price);
        this.sails = sails;
    }

    public void setSails(int sails){
        this.sails = sails;
    }

    public int getSails(){
        return sails;
    }
}
