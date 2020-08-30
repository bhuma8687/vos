package com.thk.products.services;

import java.util.List;

import com.thk.products.model.ProductLine;

public interface IProductLineService {
	
	public List<ProductLine> getProductLines();
	public Integer createProductLine(ProductLine productLine);
	public Integer deleteProductLine(String productLine);
	public ProductLine getProductLineById(String productLine);

}
