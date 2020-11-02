package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        Integer[] data = {1, 2, 2, 4, 5, 7, 7, 7, 9, 1, 4, 4, 3, 4, 5};
        String[] data2 = {"Pepe", "Fulano", "Fulano", "Ana", "Mengano", "Pedro", "Mengano", "Fulano", "Pedro", "Maria"};
        
        Histogram meta_histogram = new Histogram(data2);  
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
    
}
