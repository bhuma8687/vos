package com.thk.products.model;

public class ProductLine {
	
	private String prductLine;
	private String textDesc ;
	private String htmlDesc ;
	private byte[] imageByte;
	
	
	
	public ProductLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPrductLine() {
		return prductLine;
	}
	public void setPrductLine(String prductLine) {
		this.prductLine = prductLine;
	}
	public String getTextDesc() {
		return textDesc;
	}
	public void setTextDesc(String textDesc) {
		this.textDesc = textDesc;
	}
	public String getHtmlDesc() {
		return htmlDesc;
	}
	public void setHtmlDesc(String htmlDesc) {
		this.htmlDesc = htmlDesc;
	}
	public byte[] getImageByte() {
		return imageByte;
	}
	public void setImageByte(byte[] imageByte) {
		this.imageByte = imageByte;
	}	
	

}
