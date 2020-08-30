package com.thk.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.thk.products.model.ProductLine;
import com.thk.products.model.ProductLineRowMapper;

@Repository
public class ProductLineDao implements IProductlines{

	@Autowired
	JdbcTemplate jdbcTemplateOnlineOrder;
	
	@Override
	public List<ProductLine> getProductLines() {
		// TODO Auto-generated method stub
		
		String query = "select * from productlines";
		ProductLineRowMapper rm = new ProductLineRowMapper();		
		List<ProductLine> productLines = jdbcTemplateOnlineOrder.query(query,rm);
		
		return productLines;
	}

	@Override
	public Integer createProductLine(ProductLine productLine) {
		
		String inserQry = "insert into productlines(productLine,textDescription) values(?,?);";
		
		int count = jdbcTemplateOnlineOrder.update(inserQry, new Object[]{
				productLine.getPrductLine(),productLine.getTextDesc()
		});
		return count;
	}
	@Override
	public Integer deleteProductLine(String productLine){
		String deleteQuery = "delete from productlines where productLine =? ";
		int count = jdbcTemplateOnlineOrder.update(deleteQuery,productLine);
		
		return count;
	}
	@Override
	public ProductLine getProductLineById(String productLine){
		
		String qry = "Select * from productlines where productLine=?";
		
		ProductLineRowMapper rm = new ProductLineRowMapper();
	
		return jdbcTemplateOnlineOrder.queryForObject(qry,rm, productLine);
		
	}

}
