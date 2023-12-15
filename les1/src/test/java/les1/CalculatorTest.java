package les1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator; // создали объект

    @BeforeAll // аннотация для статического метода, будет выполняться один раз пред всеми тестами, допустим сделать настройки
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach // аннотация для статического метода, будет выполняться перед каждым тестом, допустим создание объекта
    void init() {
        calculator = new Calculator();
    }

    @AfterEach // аннотация для статического метода, будет выполняться после каждого тестом, допустим удаление  объекта
    void cleanup() {
        calculator = null;
    }

    @AfterAll // аннотация для статического метода, будет выполняться один раз после всех тестов, допустим очистить
    static void teardown() {
        System.out.println("After all tests");
    }
    @Test
    @DisplayName("Test addition") //чтобы можно было написать, допустим кириллицей
    void testAdd() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    @DisplayName("Test multiplication")
    void testMultiply() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result, "6 * 7 should equal 42");
    }

    @Test
    @DisplayName("Test division") // tckесли у нас есть один метод, но несколько аспектов, то столько и тестов на этот метод надо делать
    void testDivide() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result, "20 / 5 should equal 4");
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    void testDiscount() {
        int result = calculator.discount(100, 10);
        assertEquals(90, result, "guky");
    }

    @Test
    void testDiscountDisc(){
        assertThrows(ArithmeticException.class, () -> calculator.discount(10, 0), "Discount must be > 1");
    }
    @Test
    void testDiscountPrice(){
        assertThrows(ArithmeticException.class, () -> calculator.discount(0, 40), "Price must be > 1");
    }
}