package pkg08_custom_exception;

public class MainClass {

  public static void main(String[] args) {

    try {
      //Integer.parseInt("12.3");  //이렇게 자바가 직접 만들어내는 예외는 myexception 처리가 불가능
      throw new MyException("예외메시지", 1000);
    } catch (MyException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getErrorCode());
    }
    
  }

}