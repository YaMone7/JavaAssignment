package AccTransfer;

public class Account {
	String id;
	String name;
	int balance=0;
	
	Account(String id,String name){
		this.id=id;
		this.name=name;
	}
	Account(String id,String name,int bal){
		this.id=id;
		this.name=name;
		this.balance=bal;
	}
	public int Credit(int Amt) {
		balance+=Amt;
		return balance;
	}
	public void Debit(int Amt) {
		if(Amt<balance) {
			balance-=Amt;
		}
		else {
			System.out.println("Amount is not Enough");
		}
	}
	public void transferTo(Account another,int amt) {
		if(amt<=balance) {
			balance-=amt;
			another.Credit(amt);
		}
		else {
			System.out.println("Amount Exceed");
		}
	}
	
	public static void main(String[] args) {
		
		Account acc1=new Account("A1","Mee Mee",50000);
		Account acc2=new Account("A2","Thel Thel",120000);
		
		System.out.println("Before Account Transfer::::");
		System.out.println(acc1.name+" = "+acc1.balance);
		System.out.println(acc2.name+" = "+acc2.balance);
		
		acc1.transferTo(acc2, 40000);
		
		System.out.println("After Account Transfer::::");
		System.out.println(acc1.name+" = "+acc1.balance);
		System.out.println(acc2.name+" = "+acc2.balance);
	}

}