package counters;
import com.transport.Transport;
import land.transport.Land;

import java.util.List;

public class Wheels {
    public int getWheels(List<Transport> landTransport) {
        int wheels = 0;
        for (Transport transport : landTransport) {
                Land land = (Land) transport;
                wheels = wheels + land.getWheel();
            }
        return wheels;
    }
}
