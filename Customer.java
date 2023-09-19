package collections;
public class Customer implements Comparable 
{
	int cid;
	String cname;
	String cadd;
	public Customer() 
	{
		super();
	}
    public Customer(int cid, String cname, String cadd) 
    {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cadd = cadd;
	}

	@Override
	public String toString() 
	{
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + "]";
	}
	@Override
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		
		Customer c = (Customer)o;
		if(this.cid == c.cid) {return 0;}
		else if(this.cid > c.cid) {return 1;}
		else if(this.cid < c.cid) {return -1; }
		
		return 0;
	}
	
	
}
