package BookAuthor;

class Author{
	public String name;
	public String email;
	public char gender;
	

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}


public class Book {
	public String name;
	public double price;
	public int qty;
	Author author;
	
	
	public Author getAuthor() {
		return author;
	}

	public Book(String name,Book author,double price){
		super();
		this.name=name;
		this.price=price;
	}
	

	public Book(String name, double price, int qty, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.author = author;
	}
	public void display() {
		System.out.println("Book Name : "+name);
		System.out.println("Author : "+ name);
		System.out.println("Qty : "+qty);
		System.out.println("Price : "+price);
		System.out.println();
	}
	

	public static void main(String[] args) {
		Author auth1=new Author("Ma Sandar","sandar@gmail.com",'f');
		Author auth2=new Author("A Kyi Taw","akyitaw@gmail.com",'m');
		Book b1=new Book("G Hall Thu",5000,100,auth1);
		Book b2=new Book("Htee",3000,50,auth2);
		
		System.out.println("Author is : \'"+auth1.name+"\'\t,"+auth1.email+"\t,"+auth1.gender);
		System.out.println("Book is : \'"+b1.name+"\'\t,"+b1.price+"\t,"+b1.qty);
		System.out.println();
		System.out.println("Author is : \'"+auth2.name+"\'\t,"+auth2.email+"\t,"+auth2.gender);
        System.out.println("Book is : \'"+b2.name+"\'\t,"+b2.price+"\t,"+b2.qty);

	}

}



	