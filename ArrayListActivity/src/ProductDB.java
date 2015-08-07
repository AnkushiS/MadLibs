
public class ProductDB {

	public Product getProduct(String pop_code){
		
		
		Product productOb = new Product();
		//productOb.setCode(pop_code);
	
		
		if (pop_code.equalsIgnoreCase("java")){	
		
			productOb.setCode(pop_code);
			productOb.setDescription("Java for Dummies");
			productOb.setPrice(96.6);
			
		}
		else if (pop_code.equalsIgnoreCase("jsps")){
		    productOb.setCode(pop_code);
			productOb.setDescription("Javascript for Dummies");
			productOb.setPrice(89.35);
			
		} else if (pop_code.equalsIgnoreCase("jsps")){
			
		    productOb.setCode(pop_code);
			productOb.setDescription("asldfhosdf");
			productOb.setPrice(8.85);	
		}
		
		return productOb;
	}
	
}
