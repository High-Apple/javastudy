package pkg01_string;

import java.util.Arrays;

public class Class01_String {
  
  public static void method1() {
    
    //String 은 불변 객체(Immutable)이다.
    
    String str = "a";
    str += "b";
    str += "c";
    
    System.out.println(str);
    
  }

  public static void method2() {
    
    //String Literal : "문자열"
    //String Literal 은 JVM이 관리한다. -> 동일한 Literal 은 재사용한다. (재생성되지 않음)
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x12345678  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = "a";
    String str2 = "a";
    
    //변수명은 달라도 참조값은 같다. 아래 명령문으로 확인.
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
  }
  
  public static void method3() {

    
    // 문자열 객체 : new String("문자열")
    // 문자열 객체는 개발자가 관리한다. -> 동일한 문자열 객체도 여러 개 생성될 수 있다.
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x98765432  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x98765432
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = new String("a");
    String str2 = new String("a");
    
    //변수명도 다르고 참조값도 다르다.
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    
  }

  public static void method4() {
    
    //equals 메소드     : 같은 문자열이면 true 반환
    //equalsIgonorecase : 같은 문자열이면 true 반환(대소문자 무시한다.)
    
    String str1 = "a";
    String str2 = "A";
    System.out.println(str1.equals(str2));   //문자열 비교는 equals 로 하는거 까먹지 말고 써용
    System.out.println(str1.equalsIgnoreCase(str2));   
    
    
    
    
  }
  
  public static void method5() {
    
    //length : 문자 개수 반환
    
    String str = "hello\n";    //이스케이프시퀀스는 1글자 취급
    
    System.out.println(str.length());  //배열은 가로 없지만 문자열은 가로 있어요! 
  }
  
  public static void method6() {
    
    //charAt : 지정한 인덱스(index)의 문자 반환
    
    String str = "hello";
    
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(1));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(4));
  }
  
  public static void method7() {
    
    //indexOf     : 전달한 문자열이 발견된 첫번째 인덱스를 반환, 없으면 -1을 반환
    //lastIndexOf : 전달한 문자열이 발견된 마지막 인덱스를 반환, 없으면 -1을 반환
    
    
    String str = "hello world apple";
    
    System.out.println(str.indexOf(" "));                   //5. 첫번째 공백의 인덱스가 5이므로 5가 출력됨
    System.out.println(str.lastIndexOf(" "));               //11. 마지막 공백의 인덱스가 11이므로 11이 출력됨
  }
  
  public static void method8() {
    
    // substring(int biginIndex) : beginIndex 부터 끝까지
    // substring(int biginIndex, int endIndex) : beginIndex 부터 endIndex 이전까지 반환 (endIndex -1)
    
    String str = "hello world";
    System.out.println(str.substring(0));
    System.out.println(str.substring(0, 5));
    System.out.println(str.substring(6));
    
    int spaceIndex = str.indexOf(" ");
    
    System.out.println(str.substring(0, spaceIndex));
    System.out.println(str.substring(spaceIndex + 1));
    
    //이렇게 substring indexOf 를 섞어서 활용할 수 있어요.
    
  }
  
  public static void method9() {
    
    // startsWith : 전달한 문자열로 시작하면 true 반환
    // endsWith   : 전달한 문자열로 끝나면   true 반환
    // contains   : 전달한 문자열을 포함하면 true 반환
    
    String str = "admin@example.com";
    
    System.out.println(str.startsWith("admin"));
    System.out.println(str.endsWith(".com"));
    System.out.println(str.contains("@"));
    
    //true false 출력 -> if 랑 같이 쓰는 메소드.
    
   
  }
  
  public static void method10() {
    
    // isEmpty : 글자수가 0이면 true 반환
    // isBlank : 공백 문자이면 true 반환 (jdk11 부터 사용 가능. 둘다 공백 검사하려고 만든 API인데 isBlank는 업데이트가 좀 부족하고 아직 isEmpty가 더 폭넓게 쓰임..)
    
    String str = " ";
    System.out.println(str.isEmpty());
    System.out.println(str.isBlank());
  }

  public static void method11() {
    
    //trim : 문자열의 앞뒤에 포함된 공백 문자 제거
    
    String str = "\n hello \n";
    System.out.println(str.trim().length());  //공백을 제외한 글자수 5 출력
  }
  
  public static void method12() {
    
    // replace    : 어떤 문자열을 다른 문자열로 변환한 문자열을 반환   //정규식 패턴 아직 잘 모르니까 replace 추천
    // replaceAll : 어떤 정규식 패턴(regex)을 다른 문자열로 변환한 문자열을 반환 // 파라미터에 regex 찍히면 정규식 달라는거.

    String str = "192.168.0.214";
    
    System.out.println(str.replace(".", "_"));
    System.out.println(str.replaceAll(".", "_"));   //정규식 패턴에서 마침표는 모든 문자열을 의미한다. -------출력. 정규식 패턴은 자바가 아닌 독립적인 문법으로 다른 언어들이 가져다 씀. 회원가입 시 아이디패턴 검사 그런게 정규식 패턴...
    System.out.println(str.replaceAll("\\.", "_")); //이러면 첫번쨰와 같은 결과 출력. \\. 이스케이프시퀀스
  }
  
  public static void method13() {
    
    //split : 지정한 정규식 패턴으로 문자열을 분리한 String[](스트링배열) 을 반환한다.
    //join  : String[] 의 모든 요소와 전달한 문자열을 연결한 문자열을 반환
    
    String str = "aaa.bbb.ccc.ddd.txt";
    
    String[] result = str.split("\\.");
    
    System.out.println(Arrays.toString(result));
    
    System.out.println(result[result.length-1]);   //배열 시작과 끝 중요! 시작 idx 0 <->끝 length -1
    
    System.out.println(String.join(".", result));
  }
  
  public static void method14() {
    
    // toUpperCase : 대문자로 변환
    // toLowerCase : 소문자로 변환
    
    String str = "I am a Student";
    
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
  }
  
  public static void method15() {
    
    // format : 형식이 적용된 문자열 반환
    
    // 실수 형식
    double number1 = 100.5;
    System.out.println(String.format("%f", number1));      //사실상 아무것도 안함.
    System.out.println(String.format("%.2f", number1));    //소숫점 2자리로 맞춤
    System.out.println(String.format("%10.2f", number1));  //전체 자리수를 10자리로 맞춤
    
    // 정수 형식
    int number2 = 123;
    System.out.println(String.format("%o", number2));      //8진수
    System.out.println(String.format("%x", number2));      //16진수(0~f)
    System.out.println(String.format("%X", number2));      //16진수(0~F)
    System.out.println(String.format("%d", number2));      //10진수
    System.out.println(String.format("%5d", number2));      //10진수. 전체자리수 5개.
    System.out.println(String.format("%05d", number2));      //10진수. 전체자리수 5개. 빈공간에 0넣기.
    
    // 문자열 형식
    String str = "hello";
    System.out.println(String.format("%s", str));
    System.out.println(String.format("%10s", str));  //앞에 공백이 5개   -> 오른쪽 정렬 +
    System.out.println(String.format("%-10s", str)); //뒤에 공백이 5개   -> 왼쪽   정렬 -

  }
  
  
  
  public static void main(String[] args) {
    practice02();
    
  }

  public static void practice01() {
    
    String uri = "/project/list.do";
    String contextPath = "/project";
    //String mapping = ??; //"/list.do"
    
    System.out.println(uri.indexOf(contextPath));
    System.out.println(contextPath.length());
    
    System.out.println(uri.indexOf(contextPath) + contextPath.length());  //출력되는 8이 데이터를 가지고 와야하는 지점. 빼고싶은 문자열을 계산할 때 후속지점을 계산하는 방법.
    
    
    String mapping = uri.substring(uri.indexOf(contextPath) + contextPath.length());
    System.out.println(mapping);
    }
  
  public static void practice02() {
    
    // 앞으로 읽어도 뒤로 읽어도 동일한 문자열 판단하기
    
    String word = "level";
    
    
    //1. 한 글자씩 비교하기
    
    boolean result = true;
    for(int i = 0, length = word.length(); i < length /2; i++) {
      if(word.charAt(i) != word.charAt(length - i - 1)) {
        result = false;
        break;
      }
    }
    System.out.println(result);
    
    //2. 거꾸로 문자열을 만들어서 비교하기
    
    String reverse = "";
    for(int i = word.length() - 1; i >= 0; i--) {
      reverse += word.charAt(i);                      //성능에 좋지 않음. for문이 돌면서 중간과정에서 생성되는 찌꺼기가 계속 생김.(method1)
    }
    System.out.println(word.equals(reverse));
    
    
       
    
        
    
    
    
    
    
    
    
    
    
    
  }
}