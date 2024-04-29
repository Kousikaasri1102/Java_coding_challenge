package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Adoption_events;
import com.model.Participants;
import com.model.Pets;

public interface PetsDao {

	int save(Pets pets) throws SQLException;

	boolean findOne(int id) throws SQLException;

	void softdeleteById(int id) throws SQLException;

	List<Pets> findAll() throws SQLException;

	List<Adoption_events> findAllAdoption()throws SQLException;
	int save(Participants participants) throws SQLException;
}
