---

### **Exercise: Custom Annotations with Reflection**

#### **Part 1: Create a Custom Annotation**

1. Define a custom annotation called `@MyAnnotation`.
   - The annotation should have an element `String value()` with a default value of `"Default Value"`.
   - The annotation should be available at runtime.

---

#### **Part 2: Apply the Annotation**

2. Create a class `Person` and apply the `@MyAnnotation` to it.
   - Set the `value` element to `"Person Class Annotation"`.

---

#### **Part 3: Read the Annotation Using Reflection**

3. Create a `Main` class that uses reflection to check if the `Person` class has the `@MyAnnotation` annotation.
   - If it does, print the `value` of the annotation.

---

### **Challenge**

- Modify the annotation to make it **optional** so that the `value` element is not required when applying `@MyAnnotation` to a class.

---
