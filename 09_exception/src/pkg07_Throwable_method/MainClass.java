package pkg07_Throwable_method;

public class MainClass {
  
  
  public static void method1() {
    //예외 메시지 확인하기 (기본 예외 메시지)
    
    try {
      
      //int a = 5 /0;
      Integer.parseInt("12.5");
      
    } catch (Exception e) {  //최상위 클래스 Exception.  이 친구는 다 잡을 수 있어요~ Arith나 NumberFomat 등등등
      
      System.out.println(e.getMessage());  //자바가 미리 만들어놓은 예외메시지. 예외 별로 다르게 뜹니다. Exception 으로 해놔도 알아서 종류별로 해줌...
    }
  }
  
  
  public static void method2() {
    //예외 메시지 확인하기 (사용자 예외 메시지)
    
    try {
      
      int a = 5;
      int b = 0;
      
      if(b == 0) {
        throw new RuntimeException("0으로 나눌 수 없습니다"); //이렇게 string 을 넣을 수 있는 버전도 있다!
      }
      
      System.out.println(a / b);
    
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());   //getMessage()를 통해서 여기서 저 위 직접 만든 "0으로 나눌 수 없습니다" 가 뜬다!(-> 사용자 예외메시지) 기본 예외메세지는 별로...그닥...
      
    }
  }

  public static void method3() {
    
    // 예외 추적하기 : 개발할 때 사용
    

    try {
      
      int[] numbers = new int[] {1, 2, 3, 4, 5};
      int total = 0;
      
      for (int i = 1; i <= 5; i++) {
        total += numbers[i];
      }
      
      System.out.println(total);
      
    } catch (Exception e) {
      e.printStackTrace();                 //printStackTrace가 보다 구체적인 오류사항을 알려준다! 인덱스 배열 안맞는다 -> 인덱스 5번째 없잖아!! 이렇게 자세하게 알려줌!
    }                                      //예외처리관련해서는 printStackTrace 이게 주요 메서드고 외에는 많이 없어요~ 개발이 끝난 후 프린트스택을 걷어내고 "잘 입력하세요" 이런 예외처리들을 입력해줍니다!
    
  }
  

  
  /* + catch(Exception e){
  throw
  new
  RuntimeException(e);
} 이런식으로 해서 예외 사유를 객체로 만들어 던져버릴 수 있습니다. 보통 메소드내에서 벌어져요. 메소드의 throws와 연결해서 메소드 호출한곳에서 받아서 처리하는 식...
  public static void main(String[] args) {
*/
  
public static void main(String[] args) {
  
    
    method3();
    
     }    
    
  }