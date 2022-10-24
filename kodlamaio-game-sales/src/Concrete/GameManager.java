package Concrete;

import Entities.Game;
import Entities.Player;
import Service.IGameService;

public class GameManager implements IGameService{

	@Override
	public void purchaseGame(Player player, Game game) {
		if (player.getBalance() >= game.getPrice() && game.getCampaignPrice() <= 0) {
			
			System.out.println(player.getFullName()+ " bought the " + "'" + game.getName()+ "'"+" game");
			player.setBalance(player.getBalance() - game.getPrice());
			System.out.println(player.getFullName() + "'s Current Balance : " + player.getBalance() + "\n");
			
		}
		else if (player.getBalance() >= game.getCampaignPrice() && game.getCampaignPrice() > 0) {
			
			System.out.println(player.getFullName()+ " bought the " + "'" + game.getName()+ "'"+" game");
			player.setBalance(player.getBalance() - game.getCampaignPrice());
			System.out.println(player.getFullName() + "'s Current Balance : " + player.getBalance() + "\n");
		}
		else {
			System.out.println("Insufficient balance!");
			System.out.println("Your current balance : " + player.getBalance() + "\nGame Price : " + game.getPrice());
		}
	}

	

}
