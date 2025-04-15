
// using wrappers, wrapper functions, autoboxing, and unboxing in Java
import java.util.List;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    int index = 0;
    while (index != 10) {
      index++;
      numbers.add(index);
    }
    int sum = 0;
    for (Integer num : numbers)
      sum += num.intValue();
    System.out.println(sum);
    System.out.println(numbers);
    String schoolName = "1337";
    Integer ParsedNumber = Integer.parseInt(schoolName);
    System.out.println(ParsedNumber + 42);
  }
}
