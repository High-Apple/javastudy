package pkg02_finally;

public class MainClass {

  public static void main(String[] args) {

    //finally 블록 : 마지막에 추가할 수 있는 선택 블록으로 항상 실행된다. (예외 발생과 상관없이 실행됨. 정상이어도 실행 예외여도 실행. 나중에 DB IO 연결 닫을 때 씁니다!)
    
    String userInput = "123";
    
    try {
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    
    } catch(NumberFormatException e) {
      System.out.println("정수만 처리할 수 있습니다");
    } finally { 
      System.out.println("작업이 종료되었습니다.");
    }
    
   
    
  }

}