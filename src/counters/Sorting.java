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

    public void insersionSort(List<Transport> histransport){

        for ( int i = 0; i < histransport.size(); i++ ){
            int j = i - 1;

            while (j >= 0 && histransport.get(i).getPrice() < histransport.get(j).getPrice()){
                histransport.set(j, histransport.get(j+1));
                histransport.set(j+1, histransport.get(j));
                j--;
            }
        }

    }
}
