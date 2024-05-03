package pkg01_extends;

//class 자식 extends 부모 {}
//class 서브 extends 슈퍼 {}

public class Ev extends Car{

  public void charge() {
    System.out.println(maker);
    //System.out.println(maker); 사용 못함. 접근제어.
    System.out.println("충전");
  }
  
  /*
   * sub is a super
   * sub has a super.
   * 
   */
  
}
