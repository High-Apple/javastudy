package pkg08_object;

public class MainClass {

  public static void main(String[] args) {

    //Object 타입의 Book 객체
    Object obj = new Book("979-11-6224-187-5", "혼자 공부하는 자바");
    
    //Object 타입의 Book 객체를 Book 타입으로 캐스팅한 뒤 메소드 호출하기
    System.out.println( ((Book)obj).getIsbn());
    System.out.println( ((Book)obj).getTitle());
    
    //Object obj와 내용이 동일한 Book 객체
    Book book = new Book("979-11-6224-187-5", "혼자 공부하는 자바");
    
    System.out.println(obj.equals(book)); // 객체 obj와 객체 book 참조값이 동일하면 true 반환. 다르면 false 반환. -> false 반환
    System.out.println(book.toString()); // "객체명@참조값" 반환
    System.out.println(book); // 위와 같은 값
    
    /* ******************************************************************* */
    Student student1 = new Student(10101, "고길동");
    Student student2 = new Student(10101, "고길동");
  
    System.out.println(student1.equals(student2)); //equals 오버라이딩 후 true가 나온다.
    System.out.println(student1); //toString도 오버라이딩 해봅시다. 이걸 student1.getStuNo 한거랑 같은 효과를 내도록! 해봅시당 이거 중요해요. 이유 : 나중에 데이터 많아지면 toString 오버라이딩해서 정보 쫙 확인해보기 때문.
    System.out.println(student2); //오버라이딩 후 -> 학번, 이름 입력된 정보대로 잘 나옵니당.
    
    student1.addBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    student1.addBook(new Book("979-11-6224-187-6", "둘이 공부하는 나바"));
    student1.addBook(new Book("979-11-6224-187-7", "셋이 공부하는 다바"));
    student1.addBook(new Book("979-11-6224-187-8", "넷이 공부하는 마바"));
    student1.addBook(new Book("979-11-6224-187-9", "혼자 연구하는 사바"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b); // Book 클래스에 Object 클래스의 toString 메소드 오버라이드
      }
    }
    
    student1.removeBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    
    System.out.println();
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b); //Book 클래스에 Object 클래스의 toSting 메소드 오버라이드
      }
    }
    
  }

}
