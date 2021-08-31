package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

  @Test
  void testClass() {

    Class<Integer> integerClass = int.class;
    Class<Long> longClass = long.class;
    Class<Boolean> booleanClass = boolean.class;

    System.out.println(integerClass.isPrimitive());
    System.out.println(longClass.isPrimitive());
    System.out.println(booleanClass.isPrimitive());

  }

  @Test
  void testGetField() throws NoSuchFieldException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());
  }

  @Test
  void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());

    age.setAccessible(true);

    Person person = new Person("Eko", "Khannedy");
    person.setAge(25);

    System.out.println(age.getInt(person));
  }

  @Test
  void testInvokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

    Class<Person> personClass = Person.class;
    Method setAge = personClass.getDeclaredMethod("setAge", int.class);

    Person person = new Person();
    setAge.invoke(person, 25);

    System.out.println(person);

  }
}
