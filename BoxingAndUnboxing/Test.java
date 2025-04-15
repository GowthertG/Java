
// using boxing, unboxing, and autoboxing in Java .
import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    int PrimitiveInt = 0;

    Integer BoxedInt = null;

    try {
      int unboxedInt = BoxedInt;
    } catch (Exception e) {
      System.out.println("Error : Primitive int cant be" + e.getCause());
    }
    BoxedInt = Integer.valueOf(PrimitiveInt);
    System.out.println("Boxed Int = " + BoxedInt);
    int unboxedInt = BoxedInt;
    System.out.println("Unboxed Int = " + unboxedInt);
    List<Integer> numbers = new ArrayList<>();
    int index = 2;
    while (index < 19) {
      numbers.add(index); // Autoboxing
      index++;
    }
    int firstNumber = numbers.get(2);
    System.out.println(firstNumber);
  }
}
