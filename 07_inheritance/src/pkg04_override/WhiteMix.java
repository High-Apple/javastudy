package pkg04_override;

/*
 * 메소드 오버라이드
 * 1. 자식 클래스가 부모 클래스의 메소드를 다시 만드는 것이다.
 * 2. @Override annotation 을 추가한다.
 * 3. 똑같이(반환타입, 메소드명, 매개변수)
 */

public class WhiteMix extends Kanu{
    
  @Override 
  public void color() {
    System.out.println("커피색");
  }
  
}
