package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputStream {
  
  public static void method1() {
    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader in = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + "접속불가");
      }
      //첫 페이지 들어가는 소스코드가 텍스트로 되어있으니 그걸 받아옵니다.
      
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      String line = null;
      StringBuilder builder = new StringBuilder();
      
      while((line = in.readLine()) != null) {
        builder.append(line);
        builder.append("\n");
      }
      
      System.out.println(builder.toString());
      in.close();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
    //Connection 으로부터 Stream 을 얻어낸다는 걸 빼면 Reader 내용과 거의 흡사!
    
  }
  
  public static void method2(){
    
    String spec = "https://ssl.pstatic.net/melona/libs/1482/1482864/131081445d1f8eb6007d_20240124161628709.jpg";
    
    //  \\storage//banner.jpg 내려받기
    
     URL url = null;
     HttpURLConnection con = null;
     
     BufferedInputStream in = null;
     BufferedOutputStream out = null;
     
     try {
       url = new URL(spec);
       con = (HttpURLConnection)url.openConnection();
      
       if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
         throw new RuntimeException(spec + "접속불가");
       }
       
    
      in = new BufferedInputStream(con.getInputStream());
      
      File dir = new File("\\storage");
      if(!dir.exists()) {
        dir.mkdirs();
      }
      
      File file = new File(dir, "banner.jpg");
      out = new BufferedOutputStream(new FileOutputStream(file));
      
       
       byte[] b = new byte[10];   
       
       int readbytes = 0;
       
       while((readbytes = in.read(b)) != -1) {
        out.write(b, 0 , readbytes);
       }
       
       out.close();
       in.close();
       
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
     
    
  }
  
       
  
  public static void main(String[] args) {
          method2();
    
    
  }

}