
public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Campaign discount added : "+ campaign.getDiscountPercentage());
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		
		
	}

}
