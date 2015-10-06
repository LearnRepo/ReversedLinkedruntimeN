
public class AccessList {
	private int data;
	private AccessList AL = null;
	public static int listCount =0;
	public AccessList(int data)
	{
		this.data = data;
		listCount++;
	}
	public void addNode(AccessList AL)
	{
		this.AL = AL;
	}
	public void AccessListPrint()
	{
		System.out.println(this.data);
		if(this.AL!=null)
		{
			AL.AccessListPrint();
		}
	}
	public AccessList getNextAL()
	{
		return this.AL;
	}
	public void setNextAL(AccessList AL) {
		// TODO Auto-generated method stub
		this.AL=AL;
	}
}
