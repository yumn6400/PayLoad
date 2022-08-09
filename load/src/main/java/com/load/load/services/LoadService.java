package com.load.load.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.load.load.dao.LoadDAO;
import com.load.load.entities.Detail;
@Service
public class LoadService implements LoadServiceInterface {

	@Autowired
	private LoadDAO loadDAO;
	public LoadService() {
		super();
	}

	@Override
	public List<Detail> getAllPayloadDetails() {
		return loadDAO.findAll();
	}

	@Override
	public Detail getPayloadDetails(long shippingId) {
		return loadDAO.findById(shippingId).get();
	}

	@Override
	public void addPayloadDetails(Detail detail) {
		loadDAO.save(detail);
	}

	@Override
	public void updatePayloadDetails(Detail detail) {
		loadDAO.save(detail);
	}

	@Override
	public void deletePayloadDetails(long shippingId) {
		Detail d=loadDAO.findById(shippingId).get();
		loadDAO.delete(d);	
	}

}
