package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Nameable;
import programmerzamannow.reflection.data.Person;

import java.util.Arrays;

public class InterfaceTest {

  @Test
  void testClass() {

    Class<Nameable> nameableClass = Nameable.class;

    System.out.println(nameableClass.getName());
    System.out.println(nameableClass.isInterface());
    System.out.println(nameableClass.getSuperclass());
    System.out.println(Arrays.toString(nameableClass.getInterfaces()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredFields()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(nameableClass.getDeclaredConstructors()));

  }

  @Test
  void testSuperInterfaces() {

    Class<Person> personClass = Person.class;

    System.out.println(Arrays.toString(personClass.getInterfaces()));

  }
}
