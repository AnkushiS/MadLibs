
public class LineItem {
	
	//product object
	Product prodOb = new Product();
	int quant;
	double totalPrice;
	
	
	public Product getProdOb() {
		return prodOb;
	}
	public void setProdOb(Product prodOb) {
		this.prodOb = prodOb;
	}
		
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(){
		totalPrice = this.quant * prodOb.getPrice();
	}
		
	
}
