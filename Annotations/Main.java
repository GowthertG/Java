public class Main {
  public static void main(String[] args) {
    Class<Person> personClass = Person.class;
    if (personClass.isAnnotationPresent(MyAnnotation.class)) {
      MyAnnotation annotation = personClass.getAnnotation(MyAnnotation.class);
      System.out.println("Annotation value: " + annotation.value());
    } else {
      System.out.println("No annotation found.");
    }
  }
}
