package Service;

import Entities.Game;
import Entities.Player;

public interface IGameService {

	void purchaseGame(Player player, Game game);
	
}
