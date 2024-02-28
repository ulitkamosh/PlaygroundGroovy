import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainJava {

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer element : list) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> counts = countElements(list);
        System.out.println(counts);
    }
}
