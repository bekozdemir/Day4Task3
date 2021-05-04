import Concrete.MemberManager;
import Concrete.ProductManager;
import Entities.Campaign;
import Entities.Member;
import Entities.Product;
import Utilities.Utils;

public class Main {

	public static void main(String[] args) {
		Member berkay = new Member(1, "berkay", "özdemir", "12345678901");
		Product ageOf = new Product(1,"Age of Empires", 35.5);
		MemberManager memberManager = new MemberManager();
		
		if (Utils.checkIfValid(berkay)) {
			memberManager.add(berkay);
		}else {
			System.out.println("Geçersiz kullanýcý");
		}
		
		ProductManager productManager = new ProductManager(new Campaign(1, "firstOrderCampaign", 10.5));
		productManager.sell(ageOf, berkay);

	}

}
