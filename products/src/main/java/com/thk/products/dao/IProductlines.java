package com.thk.products.dao;

import java.util.List;

import com.thk.products.model.ProductLine;

public interface IProductlines {
	public List<ProductLine> getProductLines();
	public Integer createProductLine(ProductLine productLine);
	public Integer deleteProductLine(String productLine);
	public ProductLine getProductLineById(String productLine);

}
