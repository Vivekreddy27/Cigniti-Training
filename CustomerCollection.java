package collections;
import java.util.*;

public class CustomerCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer(55,"Krishna","Hyderabad");
		Customer c1 = new Customer(11,"Achyutha","Hyderabad");
		Customer c2 = new Customer(33,"Narayana","Hyderabad");
		Customer c3= new Customer(77,"Govindaa","Hyderabad");
		Customer c4 = new Customer(22,"Madhava","Hyderabad");
		
		TreeSet t = new TreeSet();
		t.add(c);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		Iterator i1 = t.iterator();
		while (i1.hasNext()) {
			
		//	System.out.println(i.next());
			Customer cust = (Customer)i1.next();
			System.out.println(cust);
			System.out.println("------------------");
		}
		
		List l1 = new ArrayList();
		l1.add(c);
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		
		Collections.sort(l1);
		Iterator i2 = l1.listIterator();
		while (i2.hasNext()) {
			
		//	System.out.println(i.next());
			Customer cust = (Customer)i2.next();
			System.out.println(cust);
			System.out.println("------------------");
		}
		
	}

}
