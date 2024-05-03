package pkg04_checked;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {
    
    //checked Exception : try-catch 와 같은 예외 처리 코드가 없으면 동작하지 않는 exception
    //+패키지 이름을 생략할 수 있는 2가지 경우 : 동일한 패키지 혹은 java.lang 패키지인 경우
    
    // java.net.URL url = new java.net.URL("https://www.google.com/");  
    //보통 import 처리로 패키지명은 한번만 쓰도록 함. 
        
   // URL url = new URL("https://www.google.com/");  
        //위쪽에 import java.net.URL; 
        //컴파일 오류 : exception 처리가 되지 않았다. 틀렸는지 아닌지 무관하게 예외처리 안했으니 일단 실행은 안된다.
    
    try {
      URL url = new URL("https://www.google.com/");
    } catch (MalformedURLException e) {           //이 오류도 java.net 소속. 패키지명 적어주지 않아서 오류가 남. java.net.MalformedURLException e 로 적으면 오류 안 남.
      System.out.println("잘못된 URL 입니다.");   // tps:google 이라고 적으면 이 메세지가 나옴.
    }
    
    
  }

}
