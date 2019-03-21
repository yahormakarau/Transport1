package counters;

import com.transport.Transport;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public void sortByPrice(List<Transport> transport) {
        Collections.sort(transport, new Comparator<Transport>() {
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
    public void bubbleSorting(List<Transport> mytransport){
        for ( int f = mytransport.size(); f > 0 ; f--)
            for (int h = f; h < 0; h--)
                if (mytransport.get(h).getPrice() > mytransport.get(h + 1).getPrice()) {
                    mytransport.set(h, mytransport.get(h + 1));
                    mytransport.set(h + 1, mytransport.get(h));
                }
    }
}
