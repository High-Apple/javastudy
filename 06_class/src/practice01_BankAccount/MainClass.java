package practice01_BankAccount;

public class MainClass {

  public static void main(String[] args) {
    // 생성자
    BankAccount account1 = new BankAccount();
    
    //첫번째 계좌는 setter을 이용해서 값을 저장
    //setter
    account1.setAccNo("01098765432");
    account1.setBalance(100000);
    
    //생성자
    BankAccount account2 = new BankAccount("01012345678", 50000);
  
    
    
    /////////
    
    account1.deposit(100000); //10만원 입금(성공)
    account1.deposit(-50000); //-5만원 입금(실패)
    
   long money;
   money = account1.withdrawal(300000); //10만원 출금 (성공)
   System.out.println(money);           //10만원 (출금된 금액 출력)
   money = account1.withdrawal(200000); //20만원 출금실패했음(실패)
   System.out.println(money);            //0(출금된 금액 출력)
   
   /////
   
  account1.transfer(account2, 50000); //account1 -> account2, 50000원 이체(성공)
  account1.transfer(account2, 100000); //account1 -> account2, 100000원 이체(실패)
  //이체는 입금과 출금의 합산임! 새로운 기능이 아님. 위의 것을 활용해서 해야합니다.
  
 
  }

}
