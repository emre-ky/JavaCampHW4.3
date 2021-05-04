
public class Campaign {
	
	int id;
	int discountPercentage;
	
	
	public Campaign() {
		
		
	}


	public Campaign(int id, int discountPercentage) {
		super();
		this.id = id;
		this.discountPercentage = discountPercentage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
