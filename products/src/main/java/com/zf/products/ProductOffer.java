package com.zf.products;

public class ProductOffer {
     private int ID;
	private String companyName;
	private String price;
	 private String phone;
	 private Product product;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
	
	
	@Override
	public String toString() {
		return "ProductOffer [ID=" + ID + ", companyName=" + companyName + ", price=" + price + ", phone=" + phone
				+ ", product=" + product + "]";
	}
	public ProductOffer() {
		this.ID=ListContainer.fiyatliste.size()+1;	}
	
}
