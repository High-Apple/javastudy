package pkg01_wrapper_class;

// 기본형을 클래스로 싸놓음.(wrap) -> 이렇게 되면 기본 값이 0이 아닌 null 이 되어 null이 필요 시 사용 가능. 
// 제네릭에서 주로 사용.(제네릭에서는 참조타입만 전달 가능하기 때문, 기본타입 전달 되지 않음.)
// 클래스 타입은 참조 타입. 
// 클래스 작성 시에는 타입이 미정, 인스턴스화 하면서 타입을 정해 전달함.

public class MainClass {

  public static void main(String[] args) {
    
    // Auto Boxing (기본 타입 값 -> Wrapper 타입)
    Integer num = 10;   // 구) new Integer(10) 사용. 
    
    // Auto Unboxing (Wrapper 타입 -> 기본타입)
    int iNum = num; // 바로 바뀜.
    
    System.out.println(num);
    
  }

}
