package pkg04_overloading;

public class MainClass {

  public static void main(String[] args) {

    // Calculator 객체 생성
    Calculator calculator = new Calculator();
    
   // Adder 객체 생성
    
    Adder adder = new Adder();
    
    
    // Calculator 객체 add 메소드 호출 
    calculator.add(adder, 10, 20);

    calculator.add(adder, 10, 20, 30);
    
    calculator.add(adder, 4, 5, 6, 7, 8, 100);  //배열을 이용해 제한 없이 매개변수 갯수 제한없이 합계를 구하도록 변경
    
    calculator.add(adder, 1.5, 2.5);

    calculator.add(adder, 1.5, 2.5, 3.5, 4.5);
    
  }
  
}
