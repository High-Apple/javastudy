package pkg01_java_net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Class05_URLEncoder {  //URL 전송 형식으로 문자인코딩을 해주는 클래스. 영문, 숫자는 그대로 보내고 한글이나 주소경로구분자 이런거를 전송 형식에 맞게 바꿔줌.
                                   //받을 때 원래 값으로 다시 받는게 디코딩
  /**
   * @param args
   */
  public static void main(String[] args) {

     try {
       String str = "http://www.google.com";
       String encoded = URLEncoder.encode(str, "UTF-8");
       System.out.println(encoded);
       
       String decoded = URLDecoder.decode(encoded, "UTF-8");
       System.out.println(decoded);
       
    } catch (UnsupportedEncodingException e) { //UnsupportedEncodingException 가 예외가 나옵니다. 아주 높은 확률로 오타났을때
           e.printStackTrace();     
    }
    
  }

}