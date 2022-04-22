import org.junit.jupiter.api.*;

public class CalcTest {

  Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAllMethod() {
    System.out.println("BeforeAll call");
  }

  @BeforeEach
  public void beforeEachMethod() {
    System.out.println("BeforeEach call");
  }

  @AfterEach
  public void afterEachMethod() {
    System.out.println("AfterEach call");
  }

  @AfterAll
  public static void afterAllMethod() {
    System.out.println("AfterAll call");
  }

  @org.junit.jupiter.api.Test
  public void testCalculatorMultiply() {
    // given:
    int expected = 6;
    int a = 2;
    int b = 3;
    // when:
    int resultMultiply = calculator.multiply.apply(a, b);
    // then:
    Assertions.assertEquals(expected, resultMultiply);
  }

  @org.junit.jupiter.api.Test
  public void testCalculatorIsPositive() {
    // given:
    int a = 4;
    // when:
    boolean given = calculator.isPositive.test(a);
    // then:
    Assertions.assertTrue(given);
  }

  @org.junit.jupiter.api.Test
  public void testCalculatorMinus() {
    // given:
    int expected = 97;
    int a = 100;
    int b = 3;
    // when:
    int resultMinus = calculator.minus.apply(a, b);
    // then:
    Assertions.assertEquals(expected, resultMinus);
  }
  
}
