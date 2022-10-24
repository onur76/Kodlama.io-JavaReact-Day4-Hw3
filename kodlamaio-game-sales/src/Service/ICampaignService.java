package Service;

import Entities.Campaign;
import Entities.Game;

public interface ICampaignService {
	
	void addCampaign(Game game, double campaignPercentage);
	void updateCampaign(Game game, Campaign campaign, String name, double newCampaignPercentage);
	void deleteCampaign(Game game, double campaignPercentage);

}
