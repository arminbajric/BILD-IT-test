package zadatak1;

public class Book {

	String name;
	Author autor;
	double price;
	int qtyInStock;
	Book (String name,Author autor,double price,int qtyInStock)
	{
		this.name=name;
		this.autor=autor;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public Author getAutor() {
		return autor;
	}
	 @Override
	public String toString()
	{
		return "Ime knjige:"+this.getName()+"\n"+(this.getAutor().toString())+" \nCijena knjige: "+this.getPrice()+"\nKolicina na stanju:"+ this.getQtyInStock();
		
	}
}
