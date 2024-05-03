package pkg03_return;

public class Calculator {
  
  // 반환값 : 메소드 실행 결과값
  // void : 반환값이 없음
  
  // int 반환 메소드
  int method1() {
    return 10;
    // 반환값이 2개 이상일 경우 배열을 반환값으로 줄 것
  }
  
  // int[] 반환 메소드
  int[] method2() {
    return new int[] {10, 20};
  }
  
  // Adder 타입 객체 반환 메소드
  Adder method3() {
    return new Adder();
  }
}
