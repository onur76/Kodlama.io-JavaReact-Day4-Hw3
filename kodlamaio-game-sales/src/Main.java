import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter()); // PlayerManager'a oyuncu eklerken Mernis doğrulaması tanımladık.
		Player player1 = new Player(1, "MustBeRealFullName", "MustBeRealSurname", "MustBeRealNationalID", 1998/*MustBeRealBithYear*/, 0/*Default Balance*/);
		playerManager.add(player1);
		playerManager.update(player1, 4000);// Burada player1 bakiye yüklemesi yaptı.
		
		Game game1 = new Game(1, "Super Mario World", 100);//Burada 3 oyun tanımladık.
		Game game2 = new Game(2, "GTA V", 1999.99);
		Game game3 = new Game(3, "Red Dead Redemption 2", 998);
		
		GameManager gameManager = new GameManager();
		gameManager.purchaseGame(player1, game3);// Burada player1 bir oyun satın aldı.
		
		Campaign campaign1 = new Campaign(1, "onur10", 10);// Burada id, adı ve yüzdesi olan bir kampanya oluşturduk.
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.addCampaign(game3, campaign1.getCampaignPercentage());// Burada oluşturduğumuz kampanyayı istediğimiz bir oyuna tanımladık.
		gameManager.purchaseGame(player1, game3);// Burada kampanyalı oyunu tekrar satın aldık.
		
		campaignManager.updateCampaign(game3, campaign1, "onur20", 20);// Burada kampanyanın yüzdesini, ismini ve kampanyanın tanımlı olduğu oyunları güncelledik.
		gameManager.purchaseGame(player1, game3);// Burada güncellenen kampanyalı oyunu tekrar indirimsiz fiyatıyla aldık.
		
		campaignManager.deleteCampaign(game3, campaign1.getCampaignPercentage());// Burada oluşturduğumuz kampanyayı sildik.
		gameManager.purchaseGame(player1, game3);// Burada kampanyası silinen oyunu tekrar satın aldık.
	}
}
