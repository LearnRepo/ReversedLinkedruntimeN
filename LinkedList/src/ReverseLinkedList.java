
public class ReverseLinkedList {
	private AccessList savedItem;
	private AccessList FAL;
	public void initiateReverse(AccessList AL)
	{
		if(AL.getNextAL() != null)
		{
			savedItem = AL.getNextAL();
			AL.setNextAL(null);
			this.FAL = AL;
			this.runReverse();
		}
	}
	private void runReverse() {
		// TODO Auto-generated method stub
		AccessList AL = this.savedItem;
		if(AL.getNextAL()!=null)
		{
			this.savedItem = AL.getNextAL();
			AL.setNextAL(this.FAL);
			FAL = AL;
			this.runReverse();
		}
		else
		{
			AL.setNextAL(FAL);
			FAL =AL;
		}
	}
	public AccessList getFAL()
	{
		return this.FAL;
		
	}
}
