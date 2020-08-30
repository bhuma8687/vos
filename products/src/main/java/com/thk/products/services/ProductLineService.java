package com.thk.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thk.products.dao.ProductLineDao;
import com.thk.products.model.ProductLine;

@Service
public class ProductLineService implements IProductLineService {
	
	@Autowired
	ProductLineDao productLineDao;

	@Override
	public List<ProductLine> getProductLines() {
		List<ProductLine> pl = productLineDao.getProductLines();
		for(ProductLine pline : pl){
			System.out.println(pline.getTextDesc());
			System.out.println(pline.getPrductLine());
		}
		return pl;
	}

	@Override
	public Integer createProductLine(ProductLine productLine) {
		
		return productLineDao.createProductLine(productLine);
	}

	@Override
	public Integer deleteProductLine(String productLine) {
		return productLineDao.deleteProductLine(productLine);
	}

	@Override
	public ProductLine getProductLineById(String productLine) {		
		return productLineDao.getProductLineById(productLine);
	}

}
