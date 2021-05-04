import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Gamer gamer = new Gamer();
		gamer.setNationalIdentity(123456789L);
		gamer.setFirstName("Emre");
		gamer.setLastName("Köy");
		gamer.setBirthDate(2002);
		
		
		
		
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer);
		
		
        /////////////////////////////////////////////////////////////////
	
		Game game = new Game();
		game.setGameName("Rainbow Six Siege");
		game.setPrice(100);
		
        /////////////////////////////////////////////////////////////////
		
	    Campaign campaign = new Campaign();
	    campaign.setDiscountPercentage(20);
	    
	    /////////////////////////////////////////////////////////////////
	    
	    CampaignManager campaignManager = new CampaignManager();
	    campaignManager.campaignAdd(campaign);
	    
	    
	    /////////////////////////////////////////////////////////////////
	    
	    GameSellingManager gameSellingManager = new GameSellingManager();
	    gameSellingManager.sellGame(campaign,game,gamer);
	    
	    
		

	}

}
