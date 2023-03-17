public class Account {
  private String id;
  private String name;
  private int balance;

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public int getBalance() {
    return balance;
  }
  public void credit(int amount) {
    balance += amount;
  }

  public void debit(int amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Amount exceeded balance");
    }
  }

  public void transferTo(Account anotherAccount, int amount) {
    if (balance >= amount) {
      debit(amount);
      anotherAccount.credit(amount);
    } else {
      System.out.println("Amount exceeded balance");
    }
  }

  public static void main(String[] args) {
    Account account1 = new Account("1", "Hend", 1000);
    Account account2 = new Account("2", "Mhmd", 500);
    account1.transferTo(account2, 100);
    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
  }
}
