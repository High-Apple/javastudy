package pkg03_return;

public class MainClass {

  public static void main(String[] args) {

    // calculator 타입의 calculator 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    // 잘못된 호출
    calculator.method1();
    
    // 반환값 호출 예시들
    System.out.println(calculator.method1());
    System.out.println(calculator.method1() == 10 ? "십" : "십아님");
    int a = calculator.method1();
    System.out.println(a);
  
    //int[] 반환받기
    int[] arr = calculator.method2();
    for(int n : arr) {
      System.out.println(n);
    }
    
    for(int n : calculator.method2()) {
      System.out.println(n);
    }
    
    // Adder 객체 반환 받기
    System.out.println(calculator.method3().add(1, 2, 3));
    
  }

}
