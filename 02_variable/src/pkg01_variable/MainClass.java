package pkg01_variable;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     *메모리
     *
     * 1. 램(RAM)
     * 2. 자바 프로그램이 동작하기 위한 모든 것이 저장되는 장소
     * 3. 변수도 메모리에 생성된다.
     * 4. 1바이트마다 16진수로 된 고유의 번호를 부여해서 관리한다.
     *    -> 주소값 혹은 참조값
     *    -> 16진수 작성 예시 : 0x123abc456
     */
    
    /*
     * 식별자의 이름 규칙
     * 1. Pascal Case : 각 단어의 첫 글자는 대문자, 나머지는 소문자 (클래스)
     * 2. Camel Case  : Pascal Case 와 동일하지만, 첫 글자는 소문자 (메소드, 변수)
     * 3. Snake Case  : 각 단어의 연결을 밑줄(_)
     */
    
    /*
     * 사용 가능한 식별자
     * 1. 영문
     * 2. 한글
     * 3. 숫자 (숫자로 시작은 불가능)
     * 4. 특수문자 (_, $)
     */
    
    /*
     * 변수
     * 1. 어떤 값을 저장하기 위해 메모리에 할단된 저장소를 의미한다.
     * 2. 변수를 선언
     * 3. 저장하려는 데이터의 종류에 따라 2가지로 구분한다.
     *    1) 기본 자료형(타입)
     *      (1) 값 자체를 저장하는 RAW DATA 타입
     *      (2) 8가지 타입이 제공되ㅑㅁ
     *          byte, short, int, long, float, double, char, boolean
     *    2) 참조 자료형(타입)
     *      (1) 값이 저장된 참조값을 저장하는 REFERENCE DATA 타입
     *      (2) 기본 자료형을 제외한 모든 데이터는 참조 자료형
     */
    
    // 변수 선언
    // byte : 1바이트 정수

    int myFirstVariable = 1;
    
    //-128~127 가능
    System.out.println(myFirstVariable);     
    
    // short : 2바이트 정수   
    short a = 32765;
    System.out.println(a);
    
    // int : 4바이트 정수
    int b = 100; // 대략...-21 ~ 21억
    System.out.println(b);
    
    // long : 8바이트 정수
    long c = 10000000000L;  //int 범위를 벗어나는 숫자를 long에 붙일때 마지막에L(대문자 권장) 붙여줘야 해요. 그냥 구분용으로 평소에도 써도 되고!
    System.out.println(c);
    
    // float : 4바이트 실수  //자바는 소숫점있으면 8바이트에 저장한다...그래서 뒤에 F 붙여줘야함. 보통 double 씀.
    float d =1.1F;
    System.out.println(d);
    
    // double : 8바이트 실수 //처리가능한 범위 넘어가면 알아서 반올림을 하는 등 처리해줌....
    double f = 1.1;
    System.out.println(f);
    
    // char : 2바이트 문자 (1글자만 저장 가능) //한글도 가능
    char ch = '\\';
    System.out.println(ch);
    
    /*
     * 이스케이프 시퀀스
     * 1, 역슬래시로 시작하는 특수 문자를 의미한다.
     * 2. 종류
     *    1) 줄 바꿈 : \n
     *    2) 탭      : \t
     *    3) 따옴표
     *      (1) \'
     *      (2) \"
     *    4) 역슬래시 : \\
     */
    
    //boolean : 논리값(true, false)
    boolean isAlive = false;
    System.out.println(isAlive);
    
    /*
     * 상수
     * 1. Constant Variable
     * 2. 값을 바꿀 수 없는 변수이다.
     * 3. 1) final 키워드를 추가한다.
     *    2) 반드시 초기값을 지정한다.
     *    3) 관례상 대문자로 작성한다.
     */
    
    final double PI = 3.141592;
    System.out.println(PI);
    
    /*
     * String 클래스
     * 1. 문자열을 관리하는 클래스
     * 2. 문자열을 저장하는 타입으로 사용한다.
     * 3. 참조 자료형이지만, 마치 기본 자료형처럼 쉬운 사용을 제공한다.
     * ->string은 변수에 바로 값을 저장하는 게 아니라, 참조형으로 저장해놓는다. 즉 값의 주소를 저장해놓고 그 주소를 따라 값을 불러와준다.
     */
    
    String s = "hello world";
    System.out.println(s);
  
  }

}
