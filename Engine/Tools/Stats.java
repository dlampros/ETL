package Tools;

public class Stats {
	private String name;
	private int id;
	private int packCachedMem, packMaxLoad, mailboxCachedMem, mailboxMaxLoad;
	
	public Stats(String name, int id){
		this.name = name;
		this.id = id;
		packCachedMem = packMaxLoad = mailboxCachedMem = mailboxMaxLoad = 0;
	}
	
	
	public String getItemName(){
		return name;
	}
	
	public int getItemID(){
		return id;
	}
	
	public void memLoad(int packMemory, int mailboxMemory){
		if(packMemory > packMaxLoad)
			packMaxLoad = packMemory;
		
		if(mailboxMemory > mailboxMaxLoad)
			mailboxMaxLoad = mailboxMemory;
		
		mailboxCachedMem = mailboxMemory;
		packCachedMem = packMemory;
	}

	public int getCachedMemory(){
		return packCachedMem;
	}

	public int getMaxMemLoad(){
		return packMaxLoad;
	}

	public int getMailboxCachedMemory(){
		return mailboxCachedMem;
	}

	public int getMailboxMaxMemLoad(){
		return mailboxMaxLoad;
	}
}
