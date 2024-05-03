package pkg01_string;

public class Class02_StringBuilder {
 
  /*
   *          StringBuffer       StringBuilder
   *  since    JDK 1.0             JDK 1.5
   *  thread   multi thread      single thread
   *  speed    slow                fast
   */
  
  
  
  
  public static void main(String[] args) {
    
    // StringBuilder 객체 생성
    StringBuilder builder = new StringBuilder();
    
    // 문자열 추가하기
    builder.append("바");                     //+= 를 builder 로 대체하였음.
    builder.append("나");
    builder.append("나");
    
    
    // String 객체로 바꾸기
    // 1. new String(builder)
    // 2. builder.toString()
    
    String result = builder.toString();
    System.out.println(result);
    
    
    //이렇게 StringBuilder을 통해 문자열을 연결하는데 String +++ 해서 연결하는 것보다 훨씬 성능상의 이점을 누릴 수 있음
  }
}