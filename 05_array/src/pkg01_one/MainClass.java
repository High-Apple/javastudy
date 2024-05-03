package pkg01_one;

public class MainClass {
  
  public static void method1() {
    
    /*
     * 배열
     * 1. 변수 여러 개를 하나의 이름으로 관리하는 자료구조이다.
     * 2. 각 변수 구분을 위해서 인덱스를 활용한다.'
     * 3. 구성
     *  1) 배열이름 : 모든 변수의 대표 이름
     *  2) 배열길이 : 변수의 개수
     *  3) 인덱스   : 변수를 구분하는 숫자(0부터 시작하는 정수값)
     *  4) 배열요소 : 각 변수를 의미(배열이름과 대괄호[]와 인덱스를 조합해서 사용)
     */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열의 선언과 생성과정이 모두 필요하다.
     * 2. 배열의 선언
     *  1) int[] 배열이름  - 추천
     *  2) int 배열이름[]
     * 3. 배열의 생성
     *   new int[배열길이]
     * 4. 배열이 생성되면 배열의 모든 요소는 자동으로 초기화된다.
     *   0, 0.0, false, null
     */
    
    //배열 선언
    int[] arr;
    
    //배열 생성
    arr =  new int[3];
    
    //배열요소(배열이름 + 대괄호 + 인덱스), 자동초기화 0
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
  }
  
  public static void method2() {
    
    /*
     * 배열 초기화
     * 1. 배열을 선언할 때 초기화 값을들 전달할 수 있다.
     * 2. 형식
     *   1) int[] 배열이름 = new int[]{값1, 값2, 값3, ...};
     *   2) int[] 배열이름 = {값1, 값2, 값3, ...};
     */
    
    // 배열 선언 및 초기화
    int[] arr = new int[] {10, 20, 30, 40, 50};
    
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
 

  public static void method3() {
    
    /*
     * 배열 길이
     * 1. 배열 요소의 개수를 의미한다.
     * 2. 배열이 생성된 이후에는 수정할 수 없다. 
     * 3. 배열길이 필드값
     *    배열이름.length
     */
    
    // 배열 선언 및 초기화
    int[] arr = {10, 20, 30, 40, 50};
    
    // 배열 길이 확인
    System.out.println(arr.length);
    // +필드는 값, 메소드는 기능.
    
    for(int i=0; i < arr.length; i++) {
      System.out.println(arr[i]);
      }
  }
  
  public static void method4() {
    /*
     * 배열의 길이를 늘이는 방법
     * 1. 새로운 배열을 만든다.
     * 2. 기존 배열 요소를 모두 옮긴다.
     * 3. 새로운 배열의 참조값을 가져온다.
     */

    int[] a = new int[] {10, 20, 30};
    int[] b = new int[10];
    for(int i=0; i<a.length; i++) {
      b[i] = a[i];
    }
    
    a = b;                                          //이젠 jvm이 메모리누수를 알아서 삭제해주기 때문에 delete를 해 줄 필요는 없어요.
        
     for(int i=0; i<a.length; i++) {
       System.out.println(a[i]);
      } 
  }
  
  public static void method5() {
    
    // advanced for 단순하게 데이터 참조해보고 싶을때 쓰는 용도
    // for(변수 : 배열) {}
    
    int[] arr = new int[] {10, 20, 30, 40, 50};
    for(int number : arr) {
      System.out.println(number);
    }
    
    
  }
  
  
  
  
  
  public static void main(String[] args) {
    method3();
  }
}
