package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;
import programmerzamannow.reflection.validation.Validator;

public class AnnotationTest {

  @Test
  void testValidateUsingAnotation() throws IllegalAccessException {

    Person person = new Person("Eko", "");
    Validator.validateNotBlank(person);

  }
}
