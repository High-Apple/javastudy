package pkg08_object;

public class Student {

  //field 
  private int stuNo;
  private String name;
  private Book[] books;
  private int bookCount;
  
  //constructor
  public Student() {
    books = new Book[100];
  }

  public Student(int stuNo, String name) {
    super();
    this.stuNo = stuNo;
    this.name = name;
    books = new Book[100];
  }

 //getter setter
  public int getStuNo() {
    return stuNo;
  }

  public void setStuNo(int stuNo) {
    this.stuNo = stuNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }

  public int getBookCount() {
    return bookCount;
  }

  public void setBookCount(int bookCount) {
    this.bookCount = bookCount;
  }


  //책 등록
  public void addBook(Book book) {
    if(bookCount >= books.length) {
      System.out.println("더 이상 책을 등록할 수 없습니다.");
      return;
    }
    
    books[bookCount++] = book;
  }
  //책 삭제
  public void removeBook(int idx ) {
    if(idx < 0 || idx >= bookCount) {
      System.out.println("잘못된 인덱스입니다.");
      return;
    }
    System.arraycopy(books, idx+1, books, idx, bookCount-idx-1);
    bookCount--;
    books[bookCount] = null;
  }
  
  //책 삭제(오버로딩0
  public void removeBook(Book book) {
    if(bookCount == 0) {
      System.out.println("저장된 책이 없습니다.");
      return;
    }
    
    for(int i=0; i < bookCount; i++) {
      if(book.equals(books[i])) {        //equals 참조값 찾으니까 백프로 false...삭제되는 책 없을 거임. 그러니까 Book 클래스의 Object 클래스이 equals 메소드 오버라이드 해야 한다. (isbn 이 같으면 true 반환)
        System.arraycopy(books, i+1, books, i, bookCount-i-1);
        bookCount--;
        books[bookCount] = null;
        break;
      }
    }
  }
  
  /*
   * Object 클래스의 equals() 메소드 오버라이드
   * stuNo 필드 값이 일치하면 true 반환
   */
  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;
    if(obj == this) return true;
    return this.stuNo == ((Student)obj).stuNo;       //get set 해도 되지만 같은 클래스 내니까...~.~
  }
  
  /*
   * Object 클래스의 toSrting() 메소드 오버라이드
   * "stuNo : 10101, name : 고길동" 형식의 문자열 반환
   * 
   * 사실 Object 코드는....내가 만들일 별로 없어서 상황과 개념만 잘 이해하면 됩니다 ^^ source 에 다 있음 ㅋㅋㅋㅋ
   */
  
  @Override
  public String toString() {
    return "stuNo: " + stuNo + ", name :" + name;    //반환이라는거 주의!! sop 이런거 아니에용
  }
  
}