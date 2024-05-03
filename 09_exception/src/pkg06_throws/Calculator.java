package pkg06_throws;

public class Calculator {

  public void add(int a, int b) {
    
    System.out.println(a + "+" + b + "=" + (a+b));
    
  }
  public void substraction(int a, int b) {
    
    System.out.println(a + "-" + b + "=" + (a-b));
    
  }
  public void multiplication(int a, int b) {
    
    System.out.println(a + "*" + b + "=" + (a*b));
    
  }
  
  /*
   * throws
   * 1. 메소드에서 발생한 예외를 메소드를 호출한 곳으로 던질 때 사용한다.
   * 2. 2개 이상의 예외를 던질 수 있다.
   * 3. 메소드를 호출한 곳에서는 예외 처리 코드(try-catch)가 추가되어야 한다.
   */
  
  public void division(int a, int b) throws ArithmeticException {  //이러면 calculator 클래스에서 예외가 나던게 throws를 통해 MainClass에서 예외가 발생하게 되고, try catch 문에서 문구 생성.

    System.out.println(a + "/" + b + "=" + (a/b));

  }
  
  
  
}
