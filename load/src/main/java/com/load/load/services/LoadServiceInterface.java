package com.load.load.services;

import java.util.List;

import com.load.load.entities.Detail;

public interface LoadServiceInterface {

	public List<Detail> getAllPayloadDetails();

	public Detail getPayloadDetails(long shippingId);

	public void addPayloadDetails(Detail detail);

	public void updatePayloadDetails(Detail detail);

	public void deletePayloadDetails(long shippingId);

}
