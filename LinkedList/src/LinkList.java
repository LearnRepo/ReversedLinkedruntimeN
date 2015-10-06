
public class LinkList {
	public static void main(String [] args)
	{
		AccessList AL = new AccessList(-1);
		AccessList FAL = AL;
		AccessList TAL;
		for(int i =0;i<8;i++)
		{
			TAL=new AccessList(i);
			AL.addNode(TAL);
			AL = TAL;
		}
		FAL.AccessListPrint();
		System.out.println();
		ReverseLinkedList k =new ReverseLinkedList();
		k.initiateReverse(FAL);
		k.getFAL().AccessListPrint();
	}
}
