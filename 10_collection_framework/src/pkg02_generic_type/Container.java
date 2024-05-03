package pkg02_generic_type;

public class Container<T> {

  private T item;
  // 오브젝트는 모든 것을 저장할 수 있는 만능 타입. 
  // 사용 시마다 캐스팅 필요. 
  
  public T getItem() {
    return item;
  }
  
  public void setItem(T item) {
    this.item = item;
  }
  
}
