package pkg02_parameter;

public class MainClass {

  public static void main(String[] args) {

    //객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    //메소드 호출
    calculator.method1();
    
    int a =  10;
    calculator.method2(a);
    
    calculator.method3("hello world");
    
    calculator.method4(1.5, 1.3);
    
    calculator.method5(a);
    
    calculator.method6(1, 2, 3);
    
    int[] arr = {10, 20, 30};
    calculator.method7(arr);
    calculator.method7(new int[] {10, 20, 30});
    
    calculator.method8(new Adder());
    
    Adder adder = new Adder();
    adder.add(4, 5, 6);
  }

}
