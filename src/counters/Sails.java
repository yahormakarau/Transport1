package counters;
import com.transport.Transport;
import sea.transport.Sea;

import java.util.List;

public class Sails {
    public int getSails(List<Transport> seaTransport) {
        int sails = 0;
        for (Transport transport : seaTransport) {
            Sea sea = (Sea) transport;
            sails = sails + sea.getSails();
        }
        return sails;
    }
}
