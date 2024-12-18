import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedCollectionsExample {
    public static void main(String[] args) {
        // Correctly create a SequencedMap
        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Access first and last entries
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
    }
}
