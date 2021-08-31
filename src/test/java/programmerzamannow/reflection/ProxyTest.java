package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

  @Test
  void testProxy() {

    InvocationHandler invocationHandler = new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("getName")){
          return "Car Proxy";
        }

        if(method.getName().equals("run")){
          System.out.println("Car is running");
        }

        return null;
      }
    };

    Car car = (Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
        new Class[]{Car.class}, invocationHandler);

    System.out.println(car.getClass());

    System.out.println(car.getName());

    car.run();

  }
}
