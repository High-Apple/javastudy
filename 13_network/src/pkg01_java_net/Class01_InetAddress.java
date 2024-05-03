package pkg01_java_net;

import java.net.InetAddress;

public class Class01_InetAddress {
  
  public static void main(String[] args) {
    
    try {
      InetAddress address1 = InetAddress.getByName("gdu.co.kr");
      // 컴파일 오류 : 예외처리 필요 UnknownException
      
      System.out.println("IP주소: " + address1.getHostAddress());
      System.out.println("도메인: " + address1.getHostName());
      
      //112.175.247.163 ip
      
      InetAddress address2 = InetAddress.getByAddress(new byte[] {112, (byte)175, (byte)247, (byte)163});
      //위처럼 바이트로 캐스팅해서 처리해주면 됩니다!
      
      System.out.println("IP주소 : " + address2.getHostAddress());
      System.out.println("도메인 : " + address2.getHostName());
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
}
