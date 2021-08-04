package com.zf.products;

public class Product {

	 int ID;
	 String name;
	 


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", name=" + name + "]";
	}

	public Product() {
this.ID=ListContainer.urunliste.size()+1;	}
	
	
}
