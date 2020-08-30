package com.thk.products.model;

public class Products {
	private String productCode;
	private String productName;
	private String prductLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private String qtyInStocks;
	private Double buyPrice;
	private Double msrp ;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrductLine() {
		return prductLine;
	}
	public void setPrductLine(String prductLine) {
		this.prductLine = prductLine;
	}
	public String getProductScale() {
		return productScale;
	}
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getQtyInStocks() {
		return qtyInStocks;
	}
	public void setQtyInStocks(String qtyInStocks) {
		this.qtyInStocks = qtyInStocks;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Double getMsrp() {
		return msrp;
	}
	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}
	
	
	
}
