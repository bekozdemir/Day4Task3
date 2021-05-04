package Abstract;

import Entities.Member;
import Entities.Product;

public interface ProductService  {
	
	void sell(Product product, Member member);
}
