package pkg07_polymorphism;

public class Person {

  public void powerOn(Elec elec) {  // Elec elec = new Tv() 또는 Elec elec = new Radio()
    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품 추가될 때마다 코드 추가 필요. 비추천
     * if (elec instanceof Tv) {
     * ((Tv) elec).powerOn();
     * } else if(elec instanceof Radio) {
     * ((Radio) elec).powerOn() ;
     * }
     *
     * 2. Elec 에 powerOn() 메소드를 추가하고 Tv나 Radio 가 오버라이드 하는 방법.
     */
    
    
    elec.powerOn();
  }
  
}
