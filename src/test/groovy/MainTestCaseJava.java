import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MainTestCaseJava {

    @Test
    public void testCountElements() {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(3, 1);
        expected.put(4, 2);
        expected.put(5, 2);
        Assertions.assertEquals(expected, MainJava.countElements(list));
    }

    @Test
    public void testCountElementsEmptyArray() {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> expected = new HashMap<>();
        Assertions.assertEquals(expected, MainJava.countElements(list));
    }

    @Test
    public void testCountElementsSingleElementArray() {
        List<Integer> list = Arrays.asList(1);        
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);
        Assertions.assertEquals(expected, MainJava.countElements(list));
    }
}