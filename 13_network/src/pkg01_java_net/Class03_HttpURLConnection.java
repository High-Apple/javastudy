package pkg01_java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Class03_HttpURLConnection {
  
  public static void main(String[] args) {
    
    String spec = "https://www.naver.com/";
    URL url = null;     //URL 있어야 Con 불러옴.
    HttpURLConnection con = null;
    
    try {

      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection(); //업캐스팅 된 것 다운캐스팅  
      
      /*
       * 접속 상태 확인(HTTP Response Code : 응답 코드)
       * 1. 200 : 정상
       * 2. 4xx : 요청 문제(클라이언트 문제)  //니탓이다. 주소를 잘못적었거나...접속불가로 판단하거나...
       * 3. 5xx : 서버 문제                   //내탓이다. 코드를 잘못 짯거나...Exception 나오면 다 500번대...
       */
      
      // 서버 -> 클라이언트 이 -> 화살표가 응답. 서버가 클라이언트로 보내는게 '응답'
      //클라이언트->서버  이 -> 화살표가 요청. 클라이언트가 서버로 보내는게 '요청'
      
      int responseCode = con.getResponseCode();
      
      if(responseCode == HttpURLConnection.HTTP_OK) { //(reponseCode == 200 도 됨)
        System.out.println("정상 접속");
      } else {
        System.out.println("접속 불가");
      }
      
      /*
       * Content - Type
       * 1. 컨텐트 타입
       * 2. 종류
       *  1) 문서 타입   : text/xxx
       *  2) 이미지 타입 : image/xxx
       *  3) 데이터 타입 : application/xxx
       */
      
      String contentType = con.getContentType();
      System.out.println(contentType); //text 라고 뜸.
      
      /*
       * 요청 메소드 (Request Method, 요청 방법) 
       * 1. GET  : 주소창(URL) 을 이용한 요청. 기본 요청 방식. (요청을 주소창으로 한다. get 방식이 디폴트)
       * 2. POST : 본문(Body)을 이용한 요청 (아이디 비밀번호와 같이 주소창에 찍히면 안되는 것들이 post 방식)
       */
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod);  //Get 이라고 출력

      /*
       * 요청 헤더
       * 1. 요청 정보가 저장된다.
       * 2. 종류
       *  1) User-Agent     : 무엇으로 접속하였는지에 관한 정보
       *  2) Referer        : 이전 접속 주소 정보
       *  3) Content-Type   : 컨텐트 타입
       *  4) Content-Length : 컨텐트 크기
       */
      
      //Map<String, List<String>> requestHeader = con.getRequestProperties(); //Properties 데이터 모두 보여줌. 하나씩 골라 보는건 Property
      //for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
      //  System.out.println(entry.getKey() + " : " + entry.getValue());      // EntrySet 이 별도로 선언되지 않고 for 문 내에서 이루어짐
      // }
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println(userAgent);
      String referer = con.getRequestProperty("Referer");
      System.out.println(referer);
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      // TODO: handle exception
    } finally {
      if(con != null)
        con.disconnect();  //con 이 초기화에 대해 무방비함. URL 생성하다가 오류나면 con이 null인 상태에서 disconnect 하다가 오류(널포인트참조오류)날때 조건을 달아줘야함.
    }
      
      
      
  }
}


  