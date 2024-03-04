import groovy.test.GroovyTestCase

class MainTestCaseGroovy extends GroovyTestCase {

    void testCountElements() {
        def arr = [1, 3, 4, 5, 1, 5, 4]
        def expected = [1: 2, 3: 1, 4: 2, 5: 2]
        assertEquals expected, MainGroovy.countElements(arr)
    }

    void testCountElementsEmptyArray() {
        def arr = []
        def expected = [:]
        assertEquals expected, MainGroovy.countElements(arr)
    }

    void testCountElementsSingleElementArray() {
        def arr = [1]
        def expected = [1: 1]
        assertEquals expected, MainGroovy.countElements(arr)
    }
}