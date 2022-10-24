package Concrete;

import Entities.Player;
import Service.IPlayerCheckService;
import Service.IPlayerService;

public class PlayerManager implements IPlayerService, IPlayerCheckService{

	private IPlayerCheckService _playerCheckService;
	
	
	
	public PlayerManager(IPlayerCheckService _playerCheckService) {
		
		this._playerCheckService = _playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if (_playerCheckService.CheckIfRealPerson(player)) {
			System.out.println(player.getFullName()+" has been added!" + "\n");
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(Player player, double loadBalance) {
		
			player.setBalance(loadBalance);
			System.out.println(player.getFullName()+" has been updated!" + "\n");
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player id : "+ player.getId() + " has been deleted");
	}

	@Override
	public boolean CheckIfRealPerson(Player player) {
		return true;
	}

}
