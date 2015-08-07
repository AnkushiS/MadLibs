import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {

	ArrayList<LineItem> outCollect = new ArrayList<LineItem>();

	public void addItem(LineItem details) {
		outCollect.add(details);
	}

	public ArrayList<LineItem> getLineItems() {
		return outCollect;
	}

	public double getInvoiceTotal() {
		double totalInvoice = 0.00;
		for (int i = 0; i < outCollect.size(); i++) {
			totalInvoice += outCollect.get(i).getTotalPrice();
		}
		return totalInvoice;

	}
	
	public String getFormattedTotal(double amt){
		NumberFormat currency = NumberFormat.getCurrencyInstance();	
		return currency.format(amt);
	}
	

	public static void printRow(String c0, String c1, String c2, String c3, String c4 ) {
		    System.out.printf("%-10s %-22s %-20s %-20s %-20s%n", c0, c1, String.valueOf(c2), c3, c4);
		}
		


	public void prints() {
		printRow("CODE" ,"Description",  "Price", "Qty", "total");
		for (int i = 0; i < outCollect.size(); i++) {
			printRow(outCollect.get(i).getProdOb().getCode(),
					 outCollect.get(i).getProdOb().getDescription(),
					 getFormattedTotal(outCollect.get(i).getProdOb().getPrice()),
					 String.valueOf(outCollect.get(i).getQuant()),
					 getFormattedTotal(outCollect.get(i).getTotalPrice())	
					 );
		}
		
		String InvoiceTotal = "InvoiceTotal: " + getFormattedTotal(getInvoiceTotal());
		System.out.printf("%n%55s", InvoiceTotal);
		
	}

}





