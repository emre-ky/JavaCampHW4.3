
public class GameSellingManager implements SellService {

	@Override
	public void sellGame(Campaign campaign, Game game, Gamer gamer) {
		
		double campaignPrice= game.getPrice() - (game.getPrice()*campaign.getDiscountPercentage()/100);
		
		

		System.out.println("Game Price : "+game.getPrice()+"\nPercentage of discount : "+ campaign.getDiscountPercentage()+"%"+"\n"+
		"Price after sale : "+campaignPrice);
		System.out.println(game.getGameName()+" is Buying by : "+gamer.getFirstName()+" "+gamer.getLastName()+" for "+ campaignPrice + " Turkish Liras (Successful Buying) " );
		
	}

}
