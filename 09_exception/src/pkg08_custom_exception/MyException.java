package pkg08_custom_exception;

/*
 * 사용자 예외 클래스
 * 1. java.lang.Exception 클래스를 상속한다.
 * 2. 클래스명은 Exception 으로 끝나는 것이 좋다.
 */

public class MyException extends Exception {

  //field 
  private int errorCode;
  
  //constructor
  public MyException(String message, int errorCode) {  //이 message exception, exception 이 throwable 로 전달. 거기에 있는 필드 값 detailMessage 에 저장 후, (그리고 내가 직접 만들어서 던질 때) 그리고 e.get message 에서 꺼내씀.
    super(message);      //public Exception(String message){} 생성자 호출
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  
}
