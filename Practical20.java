package Practicals;

class Product
{
	int ProductID;
	String ProductName;
	double Price;
	
	Product (int ProductID, String ProductName, double Price)
	{
		this.ProductID = ProductID;
		this.ProductName = ProductName;
		this.Price = Price;
	}
	
	void display()
	{
		System.out.println("ID of the Product is: " +ProductID);
		System.out.println("Name of the Product is: " +ProductName);
		System.out.println("Price of the product is: " +Price);
	}
	
}

class Electronics extends Product
{
	String Brand;
	
	Electronics (int ProductID, String ProductName, double Price, String Brand)
	{
		super(ProductID, ProductName, Price);
		this.Brand = Brand;
	}
	
	void display1()
	{
		super.display();
		System.out.println("Brand of the Product is: " +Brand);
	}
}

class Clothing extends Product
{
	String Brand;
	
	Clothing (int ProductID, String ProductName, double Price, String Brand)
	{
		super(ProductID,ProductName,Price);
		this.Brand = Brand;
	}
	
	void display2()
	{
		System.out.println();
		super.display();
		System.out.println("Brand of the Product is: " +Brand);
	}
}

class Books extends Product
{
	String Publisher;
	String Author;
	
	Books(int ProductID, String ProductName, double Price, String Publisher, String Author)
	{
		super(ProductID, ProductName, Price);
		this.Publisher = Publisher;
		this.Author = Author;
	}
	
	void display3()
	{
		System.out.println();
		super.display();
		System.out.println("Publisher of the Product is: " +Publisher);
		System.out.println("Author of the Product is: " +Author);
	}
}


public class Practical20 {
	

	public static void main(String[] args) 
	{
		Electronics a = new Electronics(1, "Fridge", 120000, "Samsung");
		a.display1();
		
		Clothing b = new Clothing(2, "Jeans", 7200, "Levis");
		b.display2();
		
		Books c = new Books(3, "Atomic Habits", 500, "Penguin", "James Clear");
		c.display3();
	}

}
