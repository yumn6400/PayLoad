
package com.load.load.dao;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.load.load.entities.Detail;

@Repository
public class LoadDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public void createTable()
	{
		var query="CREATE table payload(shipperId SERIAL primary key,loadingPoint varchar(255),unloadingPoint varchar(255),productType varchar(255),truckType varchar(255),noOfTruck int,weight int,comment varchar(255),date Date )";
		int update=this.jdbcTemplate.update(query);
		System.out.println(update);	
	}
	public int add(Detail detail)
	{
		var query="INSERT into table payload(loadingPoint,unloadingPoint,productType,truckType,noOfTruck,weight,comment,date) values(?,?,?,?,?,?,?,?) RETURNING shipperId;";
		return this.jdbcTemplate.update(query,
				detail.getLoadingPoint(),
				detail.getUnloadingPoint(),
				detail.getProductType(),
				detail.getTruckType(),
				detail.getNoOfTrucks(),
				detail.getWeight(),
				detail.getComment(),
				detail.getDate()
				);
		
	}
}
*/
import org.springframework.data.jpa.repository.JpaRepository;

import com.load.load.entities.Detail;


public interface LoadDAO extends JpaRepository<Detail,Long> {

}



