public class Account {
	static long x=101;
        long accNum ;
	double balance;
	//PersonAcc p;
	
	public Account(long accNum, double balance) {
		this.accNum = accNum;
		this.balance = balance;
		//this.p = p;
		//x++;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
	    this.accNum = x;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double d)
	{
		balance=(getBalance()+d);
		System.out.println("after deposit balance is"+ balance);
	}
	void withdraw(double d)
	{
		balance=(getBalance()-d);
		System.out.println("after withdrawal balance is"+balance);
	}
	
	@Override
	public String toString() {
		return " AccNum=" + getAccNum() + ", Balance=" + getBalance() ;
	}
	public static void main(String args[])
	{
		
		Account a1 = new Account(x,2000);
		a1.deposit(2000);
		System.out.println(a1.toString());
		//sc.close();
	}
}