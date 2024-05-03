package practice01_BankAccount;

public class BankAccount {
  
  //field
  private String accNo;
  private long balance;
  
  public BankAccount() {
  }
  
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }

  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  public void deposit(long money) {
    if(money <= 0) {
      System.out.println("입금액을 잘못 입력함.");
      return;
    }
    balance += money;
  }
  
  public long withdrawal(long money) {
    if(money <= 0) {
      System.out.println("출금액 잘못 입력함.");
      return 0L;
    } else if(money > balance) {
      System.out.println("출금액이 계좌금액보다 큽니다.");
      return 0L;
    } else {
      balance -= money;
      return balance;
    }
  }
  
  
  public void transfer(BankAccount bankAccount, long money) {

    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 내 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    bankAccount.deposit(withdrawal(money));
    
  }
  
  
  
  
  
  
  
  
  
  
  
}
