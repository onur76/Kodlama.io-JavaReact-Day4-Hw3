package Adapters;

import Entities.Player;
import Service.IPlayerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		
KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try 
		{
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFullName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthYear());
		} 
		catch (Exception e) 
		{
		}		
		return false;
	}

}
