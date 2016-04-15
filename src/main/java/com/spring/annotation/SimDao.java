package com.spring.annotation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.model.Sim;

//<bean id="simDao"  class="com.spring.annotation.SimDao" scope="singleton" lazy-init="false" autowire="no"/>

@Repository("simDao")
@Scope("singleton")
@Lazy(false)
public class SimDao implements ISimDao {
	
	@Autowired // means pull this bean from spring container which type is DataSource and id is 
	@Qualifier("psimDataSource")
	private DataSource simDataSource;
	
	@Override
	public void persistSim(Sim sim){
		    System.out.println("______________________SIM Detail________________");
		   System.out.println(sim);
		   try {
			   Connection connection=simDataSource.getConnection();
			   String query="insert into sims_tbl(sid,vendor,price,color,memory,dom,doe,description) values(?,?,?,?,?,?,?,?)";
			   PreparedStatement pstmt=connection.prepareStatement(query);
			   pstmt.setString(1,sim.getSid() );
			   pstmt.setString(2,sim.getVendor());
			   pstmt.setFloat(3,sim.getPrice());
			   //pstmt.set(1,sim.getImage() );
			   pstmt.setString(4,sim.getColor());
			   pstmt.setString(5,sim.getMemory() );
			   pstmt.setTimestamp(6,sim.getDom());
			   pstmt.setTimestamp(7,sim.getDoe() );
			   pstmt.setString(8,sim.getDescription() );
			   int p=pstmt.executeUpdate();
			   System.out.println("Hello data is persisted into the database..... = "+p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
		   
		   //here write database code to persist data into database
		   System.out.println("_______________________________________________");
	}
	
	@Override
	public void deleteSimBySid(String sid){
	    System.out.println("______________________deleteSimBySid________________");
	   System.out.println("deleting sim with sim id = "+sid);
	   System.out.println("_______________________________________________");
}

}
