package Concrete;

import Abstract.ProductService;
import Entities.Campaign;
import Entities.Member;
import Entities.Product;

public class ProductManager implements ProductService{

	private Campaign campaign;
	
	public ProductManager(Campaign campaign) {
		this.campaign = campaign;
	}
	@Override
	public void sell(Product product, Member member) {
		System.out.println(product.getName()+" : "+ product.getUnitPrice()+ " " +
		member.getFirstName()+ " tarafýndan satýn alýndý. Uygulanan kampanya : " + campaign.getName() +" -"+ campaign.getDiscount()+ " discount");
	}
	

}
