package pkg01_try_catch;

public class MainClass {

  public static void method1() {
    
    // 예외 처리가 발생하는 상황(실수가 들어가서 오류)
    
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
  
    System.out.println(number);
      
 }
  
 public static void method2() {      
    
    //예외 처리 : try - catch
      
    try {                                            
      
      String userInput = "12.3";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    
    } catch(NumberFormatException e) {  //예외 객체 이름은 e
                                        //이렇게 하면 아무 메세지도 안보임.
      System.out.println("정수만 입력하세요.");    //catch 블록을 비워놓으면 안 됨. 
      
    }
       
  }

 public static void method3() {
   
   String[] userInputs = {"10", "20", "1.5", "2.5", "30"}; 
 
   for(int i = 0; i < userInputs.length; i++) {
     
     try {
       
       int number = Integer.parseInt(userInputs[i]);
       System.out.println(number);
     
     } catch(NumberFormatException e) {
       
       System.out.println(userInputs[i] + "는 정수가 아닙니다.");
     }
   
   }
   
 }
 
 public static void method4() {
   
   //다중 catch 블록 (try 는 1개)
   
   String [] userInputs = {"10", "20", "15", "25", "30"};
   
   try {
     
     for(int i = 0; i < 6; i++) {
       
       int number = Integer.parseInt(userInputs[i]);
       System.out.println(number);
       
     }
       
   }  catch(NumberFormatException e) {
       System.out.println("정수만 처리할 수 있습니다.");
       
       
   }  catch(ArrayIndexOutOfBoundsException e) {
     System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
   
     } 
   
 }
 //catch 작성 시 주의사항 : 상속관계를 이해하고 만들 것! catch 블록에 순서가 있기 때문(상속관계를 따른다).
 
  public static void main(String[] args) {
    method4();

  }

}
