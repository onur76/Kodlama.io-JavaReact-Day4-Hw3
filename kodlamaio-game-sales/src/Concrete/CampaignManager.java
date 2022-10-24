package Concrete;

import Entities.Campaign;
import Entities.Game;
import Service.ICampaignService;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Game game, double campaignPercentage) {
		double applyCampaign = game.getPrice() - (game.getPrice() * (campaignPercentage / 100));
		game.setCampaignPrice(applyCampaign);
	}

	@Override
	public void updateCampaign(Game game, Campaign campaign, String name, double newCampaignPercentage) {
		campaign.setName(name);
		campaign.setCampaignPercentage(newCampaignPercentage);
		game.setCampaignPrice(game.getPrice() - (game.getPrice() * (newCampaignPercentage / 100)));
	}

	@Override
	public void deleteCampaign(Game game, double campaignPercentage) {
		/*double deleteCampaign = game.getPrice() + (game.getPrice() * (campaignPercentage / 100));
		game.setPrice(deleteCampaign);*/
		game.setCampaignPrice(0);
		
	}



}
