package collections;

public class Product {
	int pid;
	String pname;
	float price;
		
	public Product() {}
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void displayProductDetails() {
		
		System.out.println("Product Id : "+this.pid);
		System.out.println("Product Name : "+this.pname);
		System.out.println("Product Price : "+this.price);
		
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	

}
