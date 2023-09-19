package collections;

import java.util.Comparator;

public class ProductNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p = (Product) o1;
		Product p1 = (Product) o2;
		return p.pname.compareTo(p1.pname);
	}
}
