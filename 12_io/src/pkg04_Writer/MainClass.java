package pkg04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
  
  /*
   * java.io.FileWriter
   * 1. 문자 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *  1) int      (한 글자를 주고받음)
   *  2) char[]   (여러 글자를 주고받음)
   *  3) String   (여러 글자를 주고받음)
   *  
   * java.io.BufferedWriter
   * 1. 버퍼링을 지원하는 문자 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   * 4. 줄 바꿈을 위한 newLine() 메소드가 있다.
   * 
   * java.io.PrintWriter
   * 1. print 메소드(print, println, printf)를 지원하는 문자 출력 스트림이다.
   * 2. 메인 스트림 또는 보조 스트림으로 사용할 수 있다.
   */
  
  public static void method1() {
    
    File dir = new File("\\storage");
     if(!dir.exists()) {
       dir.mkdirs();
     }
     
     File file = new File(dir, "sample1.txt");
     
     // 파일 출력 스트림 선언
     FileWriter out = null;
     
     try {
       
       // 파일 출력 스트림 생성
       out = new FileWriter(file);
       
       // 출력할 데이터
       int ch = '대';
       char[] chArr = {'한', '민'};
       String str = "국";
       
       // 출력
       out.write(ch);
       out.write(chArr);
       out.write(str);
       
       // 파일 출력 스트림 닫기
       out.close();
       
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void method2() {
    
    File dir = new File("\\storage");
    if(!dir.exists());{
    dir.mkdirs();}
    
    File file = new File(dir, "sample2.txt");
    
    // 버퍼 출력  스트림 선언
    BufferedWriter out = null;
    
    try {
      
      out = new BufferedWriter(new FileWriter(file, true));   
      
      //안녕하세요
      //반갑습니다
      
      out.write("안녕하세요");
      out.newLine(); // 줄 바꿔주는 전용 메소드
      out.write("반갑습니다");
      out.newLine();
      out.write("날씨가 춥네요");
      out.newLine();
      out.write("건강 유의하세요");
      out.newLine();
      out.write("추가 확인"); 
      out.newLine();
      
      //버퍼 출력 스트림 닫기
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample3.html");   //txt를 html 로 바꾸고 확인
    
    // PrintWriter 선언
   PrintWriter out = null;
   
   try {
    
     // PrintWriter 생성
     out = new PrintWriter(file); //다양한 생성을 지원하는 것을 볼 수 있음.
     
     // 출력
    // out.println("안녕하세요");
    // out.println("반갑습니다");
     out.println("<script>");        
     out.println("alert('안녕');");
     out.println("</script>");
     
     out.close();
     
  } catch (IOException e) {
    e.printStackTrace();
  }
  }
  
  
  public static void main(String[] args) {
    method3();
  }

}
