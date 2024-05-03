package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

  /*
   * ArrayList 클래스
   * 1. 배열 리스트를 구현한 클래스이다.
   * 2. 실무에서는 배열 대신 사용한다.
   * 3. 배열의 특징을 그대로 가지고 있다.
   *  1) 순서대로 데이터가 저장된다.
   *  2) 인덱스를 가지고 있다.
   *  
   *  배열과 달리 제한이 없다.
   *  삭제를 알아서 해줌.
   */
  
  public static void method1() {
    // ArrayList 선언 (사용 가능 타입 : Collection<E>, ArrayList<E>, (Element의 E)
    List<Integer> numbers;
    
    // ArrayList 생성
    numbers = new ArrayList<Integer>(); // number = new int[]; 를 ArrayList로 생성.
    
    // 요소 추가하기
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(2);
    numbers.add(1);
  
    // 요소 가져오기
    System.out.println(numbers.get(0));
    
  }
  
public static void method2() {
    
    //ArrayList 선언 및 생성
    List<String> hobbies = new ArrayList<String>();
    
    //요소 추가하기
    hobbies.add("게임");
    hobbies.add("여행");
    hobbies.add("수영");
    hobbies.add("레고");
    hobbies.add("모임");
    
    //저장된 요소의 개수 확인
    System.out.println(hobbies.size());
    
    
    //저장된 데이터 확인
    for(int i = 0, size = hobbies.size(); i < size; i++) {  //advanced for 문도 어케하는지 다시 보기..헷갈려...int a = 1, b = 2 이거됨. size도 int 라는 뜻...
      System.out.println(hobbies.get(i));
    }
  }

  public static void method3() {
    
    //배열을 ArrayList로 바꾸기
    Integer[] arr = new Integer[]{10, 20, 30};   //int는 ArrayList로 못바꾸니까 Integer로 해야죱. 이런걸 생각해줘야 함!
    
    //배열을 List로 바꿔서 반환하는 java.util.Arrays 클래스의 asList 메소드
    //Arrays.asList(arr); 이렇게 변환 후 아래처럼 완성.
    List<Integer> numbers = Arrays.asList(arr);
    
    //numbers는 길이를 변경할 수 없다. (추가, 삭제 불가)
    
    //간단히 데이터 확인 
    System.out.println(numbers); //toString 메소드 생략. 
    System.out.println(numbers.toString()); //원래 @참조값이 떠야하는데 아님...!!! 내용이 나온다!! ArrayList가 toString도 이렇게 만들어둔거에요^^ 사실 for문 돌려서 내용 확인할 필요없어요 ㅎ
    
  }

  public static void method4() {
    
    List<String> seasons = new ArrayList<String>();
    
      seasons.add("봄");
      seasons.add("여름");
      seasons.add("파인애플");
      seasons.add("피자");
      seasons.add("겨울");

      // 요소 수정
      seasons.set(2, "가을");
      
      seasons.remove(3);
      
      System.out.println(seasons);
      
    }
    
  
  
  public static void main(String[] args) {
    method3();
  }

}
