package com.thk.products.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductLineRowMapper implements RowMapper<ProductLine> {

	@Override
	public ProductLine mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductLine pl = new ProductLine();
		pl.setPrductLine(rs.getString("productLine"));
		pl.setTextDesc(rs.getString("textDescription"));
		pl.setHtmlDesc(rs.getString("htmlDescription"));
		
				
		//image
		return pl;
	}

}
