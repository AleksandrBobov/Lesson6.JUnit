
public class Main {

  public static void main(String[] args) {

    Calculator calc = Calculator.instanse.get();
    int a = calc.plus.apply(1, 2);
    int b = calc.minus.apply(1, 1);
    int c = calc.devide.apply(a, b);
    calc.println.accept(c);

    int d = calc.abs.apply(-4);
    calc.println.accept(d);
  }
}
