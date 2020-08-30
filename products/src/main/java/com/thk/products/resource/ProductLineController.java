package com.thk.products.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thk.products.model.ProductLine;
import com.thk.products.services.ProductLineService;



@RestController
@RequestMapping("/prductLine")
public class ProductLineController {
	@Autowired
	ProductLineService productLineService;
	
	@PostMapping("/createProductLine")
	public ResponseEntity<String> createProductLine(@RequestBody ProductLine productLine){
		String val = null;
		int count =productLineService.createProductLine(productLine);
		if(count==0){
			return new ResponseEntity<String>(val,HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<String>(val,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getProductLine")
	public ResponseEntity<List<ProductLine>> getProductLine(){
		
		List<ProductLine> prodLines= productLineService.getProductLines();
		
		return new ResponseEntity<List<ProductLine>>(prodLines, HttpStatus.OK);
		
		
	}
	@DeleteMapping("/delProductLine/{productLine}")
	public ResponseEntity<HttpStatus> deleteProductLine(@PathVariable("productLine") String productLine){
		
		int count =productLineService.deleteProductLine(productLine);
		if(count!=0){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/getProdcutLineById/{productLine}")
	public ResponseEntity<ProductLine> getProdcutLineById(@PathVariable("productLine") String productLine){
		
		ProductLine prodLine= productLineService.getProductLineById(productLine);
		return new ResponseEntity<ProductLine>(prodLine, HttpStatus.OK);
	}
}
