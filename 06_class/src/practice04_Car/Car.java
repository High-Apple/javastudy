package practice04_Car;

public class Car {
   
  // field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100;
  
  public Car() {
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void enginStart() {
    if(driver == null || fuel == 00) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }
  }
  
  public void accelerator(int pushTime) {
    if(currSpeed == MAX_SPEED) {
      System.out.println("최고 속도임");
      return;
    } 
    if(fuel == 0) {
      System.out.println("연료 없음");
      return;
    } 
    if(pushTime <= 0) {
      System.out.println("엑셀 제대로 밟아");
      return;
    }
    int n = driver.isBestDriver() ? 10 : 5;
    currSpeed += (pushTime * n);
    currSpeed = Math.min(currSpeed, MAX_SPEED);
    
    fuel -= pushTime;
    fuel = Math.max(fuel, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + currSpeed);
    
  }
  
  public void brake(int pushTime) {
    if(currSpeed == 0) {
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    
    if(pushTime <= 0) {
      System.out.println("brake 를 잘 밟으세요.");
      return;
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + currSpeed);

    
  }
  
  
}
