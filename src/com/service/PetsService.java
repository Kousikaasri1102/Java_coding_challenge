package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Adoption_events;
import com.model.Participants;
import com.model.Pets;
import com.dao.PetsDao;
import com.dao.PetsDaoImpl;

public class PetsService {
	PetsDao petsDao=new PetsDaoImpl();
	public int insert(Pets pets) throws SQLException{
		return petsDao.save(pets);
	}
	public void softdeleteByid(int id) throws SQLException {
		boolean isIdValid=petsDao.findOne(id);
		petsDao.softdeleteById(id);
		
	}
	public List<Pets> findAll() throws SQLException{
		return petsDao.findAll();
	}
	
	public List<Adoption_events> findAllAdoption() throws SQLException{
		return petsDao.findAllAdoption();
	}
	public int insert(Participants participants) throws SQLException{
		return petsDao.save(participants);
	}

}
