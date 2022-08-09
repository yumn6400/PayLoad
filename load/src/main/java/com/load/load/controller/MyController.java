package com.load.load.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.load.load.entities.Detail;
import com.load.load.services.LoadServiceInterface;

@RestController
public class MyController {
	@Autowired
private LoadServiceInterface loadService;
	@GetMapping("/load")
	public List<Detail> getAllPayloadDetails()
	{
		return loadService.getAllPayloadDetails();
	}
	@GetMapping("/load/{shippingId}")
	public Detail getPayloadDetails(@PathVariable String shippingId)
	{
		return loadService.getPayloadDetails(Long.parseLong(shippingId));
	}
	@PostMapping("/load")
	public ResponseEntity<HttpStatus> addPayloadDetails(@RequestBody Detail detail)
	{
		try
		{
		loadService.addPayloadDetails(detail);
		return new ResponseEntity<>(HttpStatus.OK);
	    }catch(Exception e)
	    {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
		
	}
	
	@PutMapping("/load/{shippingId}")
	public ResponseEntity<HttpStatus> updatePayloadDetails(@PathVariable String shippingId , @RequestBody Detail detail)
	{
		try
		{
		 loadService.updatePayloadDetails(detail);
		 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/load/{shippingId}")
	public ResponseEntity<HttpStatus> deletePayloadDetails(@PathVariable String shippingId)
	{
		try
		{
		loadService.deletePayloadDetails(Long.parseLong(shippingId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
