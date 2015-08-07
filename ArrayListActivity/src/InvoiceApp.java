
import java.util.*;

public class InvoiceApp {

	static Invoice invc = new Invoice();
	static Product p = new Product();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String opted = "Y";
		System.out.println("Welcome to the invoice Application");
		Scanner scan = new Scanner(System.in);
		
		while(opted.equalsIgnoreCase("Y")){
			//ask for input 
			String pop_code = Validator.getString(
	                scan, "Enter Product Code: ");
			
	        int quant = Validator.getInt(
	                scan, "Enter quantity:     ");
			
			LineItem ll = new LineItem();
			ProductDB pp = new ProductDB();
			//set values
			ll.setProdOb(pp.getProduct(pop_code));
			ll.setQuant(quant);
			ll.setTotalPrice();
			
			//get values
			ll.getProdOb();
			ll.getQuant();
			ll.getTotalPrice();
			
			invc.addItem(ll);		
						
			System.out.println("Anothe Line Item? (y/n)");
			opted = scan.next();
			if(opted.equalsIgnoreCase("n")){
				invc.prints();
				break;
			}
		}
	scan.close();	
	}
}
