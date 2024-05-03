package pkg01_object;

public class MainClass {

  public static void main(String[] args) {

    // 객체 선언
    Calculator calculator;
    
    // 객체 생성
    calculator = new Calculator();
    
    // 클래스 멤버(데이터, 기능 등)을 사용하기 위해서는 객체 선언과 생성이 필요함.
    
    calculator.number = 100;
    System.out.println(calculator.number);
    
  }

}
