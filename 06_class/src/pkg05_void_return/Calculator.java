package pkg05_void_return;

public class Calculator {
  
  /*
   * 반환타입이 void인 경우에는 return;코드로 메소드 실행을 중지할 수 있다. 각종 예외처리에 흔히 쓰임 
   */

  void root(int number) {
    if(number <= 0) {
      System.out.println(number + "는 제곱근 계산 할 수 없다.");
      return;
    }
    System.out.println(number + "의 제곱근은 " + Math.sqrt(number) + "입니다.");
  }




}
