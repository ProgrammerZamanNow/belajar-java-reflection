package programmerzamannow.reflection.data;

import java.io.Serializable;

public class Data<T extends AutoCloseable & Serializable> {

  private T data;

  public Data(T data) {
    this.data = data;
  }

  public Data() {
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
