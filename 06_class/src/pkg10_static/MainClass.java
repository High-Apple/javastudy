package pkg10_static;

public class MainClass {

  public static void main(String[] args) {
    
    // 클래스 멤버 호출 : 클래스.멤버
    System.out.println(Calculator.maker);
    
    //static 멤버는 static만 호출할 수 있다. 같은 클래스에 method 불러오려면 static 붙여야 함.
    
    int num = Integer.parseInt("100");
    System.out.println(num);
    
    Calculator.add(4, 5); //클래스.메소드 호출하기
  
  }

}
