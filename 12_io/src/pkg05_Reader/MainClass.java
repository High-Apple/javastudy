package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
  
  /*
   * java.io.FileReader 
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) String
   */
  
  /* 
   * java.io.BufferedReader
   * 1. 버퍼링을 지원하는 문자 입력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.   
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   * 4. 한 줄 씩 읽는 readLine() 메소드가 있다.   
   *    
   */
  
  /*
   * java.io.InputStreamReader
   * 1. 바이트 입력 스트림을 문자 입력 스트림으로 변환한다.
   * 2. 바이트 입력 스트림으로 문자 데이터가 전달되는 경우 사용한다.
   */
  
 public static void method1() {
   
   File dir = new File("\\storage");
   File file = new File(dir, "sample1.txt");
   
   
   // 파일 입력 스트림 선언
   FileReader in = null;
   
   try {
     
     // 파일 입력 스트림 생성
     in = new FileReader(file);
     
     char[] cbuf = new char[2];
     
     // 읽은 데이터 저장소(글자 단위로 가져왔으니 배열은 필요없어요. String 으로)
     StringBuilder builder = new StringBuilder();
     
//     // 배열과는 달리 실제 읽은 글자수가 상이할때(2짜리 배열인데 나머지 1글자 남은 경우.  반환값이  2 2 1 -1 로 바뀌는 거 유의)
//     System.out.println(in.read(cbuf)); //2
//     System.out.println(in.read(cbuf)); //2
//     System.out.println(in.read(cbuf)); //1
//     System.out.println(in.read(cbuf)); //-1
     
     //읽은 글자수
     int readChar = 0;
     
     //읽기
     while(true) {
       readChar = in.read(cbuf);
       if(readChar == -1) {
         break;
       }
       builder.append(cbuf, 0, readChar);
     }
  
     
     // 확인
     System.out.println(builder.toString());
     
     // 파일 입력 스트림 닫기
     in.close();
     
  } catch (IOException e) {
      e.getStackTrace();
  }
   
 }

 public static void method2() { 
   
   File dir = new File("\\storage");
   File file = new File(dir, "sample2.txt");
   
   // 버퍼 입력 스트림 선언
   BufferedReader in =null;
   
   try {
    
     // 버퍼 입력 스트림 생성
     in = new BufferedReader(new FileReader(file));
     
     // 읽는 단위
     String line = null;
     
     // 읽은 데이터 모으기
     StringBuilder builder = new StringBuilder();
     
     // readLine() 메소드는 파일에 끝에 도달하면 null 을 반환함(String 이라서 -1 반환못함!!!)
//     while(true) {
//       line = in.readLine();                  
//       if(line == null) {                     
//         break;
//       }
//       builder.append(line).append("\n");      //미관상의 줄바꿈 추가...데이터 자체에는 차이 없어용.
//     }
     
     //위 루프문의 보다 깔끔하고...발전된 코드
     while((line = in.readLine())!= null) {  
       builder.append(line).append("\n");
     }
    
     // 확인
     System.out.println(builder.toString());
     
     // 버퍼 입력 스트림 닫기
     in.close();
     
     /*InputStream에 포함된 문자를 안 깨지고 잘 받기
    1. InputStreamReader 를 사용한다.  //보통 이거 씁니다.
    2. DataInputStream 을 사용한다.
      */
     
   } catch (IOException e) {
    e.getStackTrace();
  }
   
 }
  
  public static void method3() { //InputStreamReader에 껴서 가져오는 방법.
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.html");
    
    //BufferedReader 선언
    BufferedReader in = null;
    
    try {
      
      // BufferedReader 생성
      // 바이트 입력 스트림(FileInputStream) -> 문자 입력 스트림(InputStreamReader) -> 버퍼 입력 스트림(BufferedReader)
      
      in = new BufferedReader(new InputStreamReader(new FileInputStream(file))); 
      
      // 읽는 단위
      String line = null;
      
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // 읽기
      while ((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      // 확인
      System.out.println(builder.toString());
      
      // BufferedReader 닫기
      in.close();
      
      
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
 
 
  public static void main(String[] args) {
    
    method3();
    
  }

}