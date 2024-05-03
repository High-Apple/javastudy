package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//key-value로 다니는 객체(변수명 - 변수값)과 유사함. 그렇기에 객체 대신 사용.
//key 찾을 때 hash 알고리즘 사용.-> hashmap. 키 자체도 set로 되어있음. 키 값 중복, 순서 없음.
//List<Map<V, k>> 조합 유용함.

public class MainClass {

  /*
   * HashMap
   * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
   * 2. 구성
   *  1) key    : 데이터 식별자, Set으로 구성되어 있다. (순서 없고 중복 없다.)
   *  2) Value  : 데이터 자체
   *  3) Entry  : Key 와 Value 합쳐서 부르는 말이다.
   */
  
  public static void method1() {
  
    //Mutuable 객체 (값이 변할 수 있는 객체)
    
    //HashMap 선언
    Map<String, Object> book;
    
    //HaspMap 생성
    book = new HashMap<String, Object>();
    
    //Key, Value 추가 (Entry 추가)
    book.put("title", "어린왕자");
    book.put("author", "생텍쥐페리");
    book.put("isBestSeller", true);
    book.put("price", 10000);
    
    // key 를 이용해서 value 확인하기
    System.out.println(book.get("title"));
    System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적"); //Object라서 boolean으로 캐스팅해줘야함. 바로 이런 번거로움 때문에 Object에 다른 데이터타입 저장하는 거 잘 안해요...
    System.out.println(book.get("price"));                         
    System.out.println(book.get("author")); 
    
  }
  
  public static void method2() {
    
    //Immutable 객체 (값을 바꿀 수 없는 객체) : 값의 변조를 막기 위함.
    
    Map<String, Object> map = Map.of("name", "홍길동");   

    //map.put("age", 10); 오류
    
    System.out.println(map.get("name"));
    
  }
  
  public static void method3() {
    
    // key 는 Set 으로 되어있다.
    
    Map<String, Object> map = Map.of("name", "홍길동"
                                    , "age", "10"
                                    , "isMarried", false);
  
    Set<String> keys = map.keySet();  //set는 인덱스가 없기 때문에 advanced for 문으로 뽑는다. 
    
    for(String key : keys) {
      System.out.println(key);             //key 값 출력
      System.out.println(map.get(key));    //value 값 출력
      System.out.println(key + " : " +map.get(key));    //예쁘게 출력
    }
  }
  
  public static void method4() {
    
    //Entry 전체를 Set 로 만들 수 있다. (map이 iterable 못하기 때문에 set에 넣어줌.)
    
    Map<String, Object> map = Map.of("name", "홍길동"
                                    , "age", "10"
                                    , "isMarried", false);
    
    Set<Entry<String, Object>> entrySet = map.entrySet(); 
    
    for(Entry<String, Object> entry : entrySet) {
      System.out.println(entry.getKey() + ":"+ entry.getValue());
    }
  }
  
  public static void method5() {
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    //처음 입력되는 key 는 추가된다.    
    map.put("name", "홍길동");
    map.put("age", "10");
    map.put("isMarried", false);
    
    //다시 입력되는 key 는 수정을 의미한다.
    map.put("age", 20);
    
    map.remove("isMarried");
    
    
    System.out.println(map);
    
  }
  
  
  
  public static void main(String[] args) {
    method5();
  }

}
