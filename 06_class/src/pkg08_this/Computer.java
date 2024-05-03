package pkg08_this;

public class Computer {

  String model;
  int price;
  
  // this() : 생성자를 호출하는 것
  Computer() {
    this(null, 0);  // 3번 생성방법 호출
  }
  
  Computer(String model) {
    this(model, 0); // 3번 생성방법 호출
  }
  
  Computer(String model, int price) { // 기본 생성자. 
    this.model = model;
    this.price = price;
  }
  
  public void showThis() {
    System.out.println(this); // 현재 객체(showThis() 메소드를 호출한 객체) 의미
  }
  
  public void showModel() {
    System.out.println(this.model);
  }

  // this() : 생성자를 호출하는 것
  // this.멤버 : 멤버(필드, 메소드)를 호출하는 것
  
}
