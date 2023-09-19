package collections;
import java.util.*;


public class ProductCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product(333,"HPLaptop",40000);
		Product p1 = new Product(555,"Book",100);
		Product p2 = new Product(111,"Mouse Pad",100);
		Product p3 = new Product(444,"Printer",30000);
		Product p4 = new Product(222,"CPU",20000);
		
	    ProductIdComparator pic = new ProductIdComparator();
	ProductNameComparator pnc = new ProductNameComparator();
		
// If List
	List<Product> productList = new ArrayList<>();
		productList.add(p);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		Collection.sort(productList,pnc);
		Iterator i = productList.listIterator();
		while (i.hasNext()) {
			Product prod = (Product)i.next();
			prod.displayProductDetails();
		System.out.println("------------------");
		}
				
	// If TreeSet	
		TreeSet ts = new TreeSet(pnc);
		ts.add(p);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		Iterator i1 = ts.iterator();
		while (i1.hasNext()) {
		Product prod = (Product)i1.next();
		prod.displayProductDetails();
		System.out.println("------------------");
		}
		
	}

}
