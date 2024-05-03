package pkg09_access_modifier;

public class MainClass {

  public static void main(String[] args) {
    
    // default 는 현실에선 거의 쓰지 않음. protected 는 상속관계에서 제한적으로 사용. 
    // private은 주로 필드에, public은 주로 매서드에 할당.
    
    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxy", 400, new Calculator());
    
    // 필드로 값을 전달하는 메소드(set, get은 약속됨.)
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
    // 필드값을 가져오는 메소드
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    computer.getCalculator().add(4, 5, 6);
    
    
    
  }

}
