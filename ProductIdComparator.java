package collections;

import java.util.Comparator;

public class ProductIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p = (Product) o1;
		Product p1 = (Product) o2;
		int x=0;
		if(p.pid == p1.pid) {x= 0;}
		else if (p.pid > p1.pid) {x= 1; }
		else if(p.pid < p1.pid) {x= -1;}
		return x;
	}

}
