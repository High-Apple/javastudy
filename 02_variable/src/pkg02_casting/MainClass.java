package pkg02_casting;

public class MainClass {
  
  public static void main(String[] args) {
    
    /*
     *  기본 자료형 변환
     *  1. 자동 변환(묵시적 형 변환)이 있다.
     *    1) promotion
     *    2) 값의 도메인(domain : 값의 범위)이 작은 타입을 큰 타입으로 바꿀 때 동작한다.  ex)int를 long으로 바꿀때..자동으로 바뀐다.
     *    3) byte -> short -> int -> long -> float -> double
     * 2. 강제 변환이 있다.
     *    1) casting
     *    2) 값의 도메인이 큰 타입을 작은 타입으로 바꿀 때 사용하면 좋다.
     *    3) 기타 필요에 의해서 강제 변환을 시킬 수 있다.   
     */
    
    //자동 변환
    
    int a = 100;
    long b = a;         //자동 변환이 이루어지는 곳
    double c = b + 1.5; //자동 변환이 이루어지는 곳 (b를 double 타입으로 자동 변환하고 더하기를 한다.)
    System.out.println(c);
    
    //강제 변환
    long x = 10L;
    int y = (int)x; //변수 x를 강제로 int 타입으로 잠시 변환. 잠시!! 잠깐!!! 해달라니까 해주는 거야 어???  
    //x=10은 무사히 나옴. 하지만 x = 1000000000000 뭐 이렇게 치면 1410065408 뭐 이런식으로 나옵니다...
    byte z = (byte)y; //변수 y를 강제로 byte 타입으로 잠시 변환. x=10 까지는 이 친구도 무사히 나옴...256넣으면 0나옴. 마지막 1바이트(8비트)에 남은 숫자만 내보내주는거...
    System.out.println(z); // 
    
    /*
     * 문자열을 Number 타입으로 변환하기
     * 1. int로 바꾸기
     *    integer.parseInt("1") -> int 타입 1 반환
     * 2. long으로 변환하기
     *    Long.parseLong("1") -> long 타입 1반환
     * 3. double로 변환하기
     *    Double.parseDouble("1.1") -> double 타입 1.1 반환
     *    
     * 잘못된 값을 전달하면 NumberFormatException 예외를 반환한다.
     */
    
    String s1 = "1";
    int n1 = Integer.parseInt(s1);  
    long n2 = Long.parseLong(s1);
    System.out.println(n1);   //ctrl + alt + 방향키 = 복사 
    System.out.println(n2);  
    
    String s2 = "1.1";
    double n3 = Double.parseDouble(s2);
    System.out.println(n3);
    
    String s3 = "십";    //java : 말같잖은 소리 해라
    int n4 = Integer.parseInt(s3);
    System.out.println(n4);
    
  }
  
}
