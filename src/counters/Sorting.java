package counters;

import com.transport.Transport;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public void sortByPrice(List<Transport> alltransport) {
        Collections.sort(alltransport, new Comparator<Transport>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                if(o1.getPrice() > o2.getPrice())
                    return 1;
                if(o1.getPrice() < o2.getPrice())
                    return -1;
                else {
                    final int i = 0;
                    return i;
                }
            }
        });
    }
}
