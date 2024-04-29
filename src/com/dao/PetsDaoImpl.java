package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Adoption_events;
import com.model.Participants;
import com.model.Pets;
import com.mysql.jdbc.PreparedStatement;
import com.utility.DBConnection;

public class PetsDaoImpl implements PetsDao {
	@Override
	public int save(Pets pets) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO pets(id,name,age,breed )VALUES (?,?,?,?)";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, pets.getId());
		pstmt.setString(2, pets.getName());
		pstmt.setInt(3, pets.getAge());
		pstmt.setString(4, pets.getBreed());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public boolean findOne(int id) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select id from pets where id=?";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst=pstmt.executeQuery();
		boolean status=rst.next();
		DBConnection.dbClose(); 
		return status;
	}

	@Override
	public void softdeleteById(int id) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="update pets SET availablity='sold' where id=?";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	    DBConnection.dbClose();	
		
	}

	@Override
	public List<Pets> findAll() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from pets where availablity='yes'";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Pets> list = new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("id");
			String name=rst.getString("name");
			
			int age=rst.getInt("age");
			String breed=rst.getString("breed");
			
			Pets pets=new Pets(id,name,age,breed);
			list.add(pets);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public List<Adoption_events> findAllAdoption() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from adoption_events";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Adoption_events> list = new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("id");
			String name=rst.getString("name");
			String location=rst.getString("location");
			
			Adoption_events adoption_events=new Adoption_events(id,name,location);
			list.add(adoption_events);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public int save(Participants participants) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO participants(id,name,adoption_event_id )VALUES (?,?,?)";
		PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
		pstmt.setInt(1, participants.getId());
		pstmt.setString(2, participants.getName());
		pstmt.setInt(3, participants.getAdoption_event_id());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}
}
