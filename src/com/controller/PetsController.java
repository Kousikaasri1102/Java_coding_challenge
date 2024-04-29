package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Pets;
import com.model.Adoption_events;
import com.model.Participants;
import com.service.PetsService;

public class PetsController {
     public static void main(String[] args) {
		PetsService petsService=new PetsService();
		
		Scanner sc = new Scanner(System.in);
		 while(true) {
				System.out.println("Press 1. Add Pets ");
				System.out.println("Press 2. Remove Pets ");
				System.out.println("Press 3. Display available pets ");
				System.out.println("Press 4. List Adapotion Details ");
				System.out.println("Press 5. Register Participants");	
				System.out.println("Press 0. to Exit");
				int input = sc.nextInt();
				if(input == 0) {
					System.out.println("Exiting Petpals..");
					break; 
				}
				switch(input) {
				case 1: 
					Random random=new Random();
					int randomNumber=random.nextInt();
					int id=randomNumber<0?randomNumber*-1:randomNumber;
					System.out.println("Enter name");
					sc.nextLine();
					String name=sc.nextLine();
					System.out.println("enter age");
					int age=sc.nextInt();
					System.out.println("enter breed");
					sc.nextLine();
					String breed=sc.nextLine();
					
					Pets pets=new Pets(id,name,age,breed);
					try {
						int status=petsService.insert(pets);
						if(status==1)
							System.out.println("Pet record added to DB..");
						else
							System.out.println("Insert operation failed..");
						
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.out.println("Enter Pet ID");
					try {
						petsService.softdeleteByid(sc.nextInt());
							System.out.println("Pet with given Id Soldout..");
							
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					try {
					List<Pets> list=petsService.findAll();
					for(Pets a:list) {
						System.out.println(a);
					}
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					try {
					List<Adoption_events> list=petsService.findAllAdoption();
					for(Adoption_events a: list) {
						System.out.println(a);
					}
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5: 
					Random random1=new Random();
					int randomNumber1=random1.nextInt();
					int p_id=randomNumber1<0?randomNumber1*-1:randomNumber1;
					System.out.println("Enter name");
					sc.nextLine();
					String name1=sc.nextLine();
					System.out.println("enter adoption_event_id");
					int adoption_event_id=sc.nextInt();
					
					Participants participants=new Participants(p_id,name1,adoption_event_id);
					try {
						int status=petsService.insert(participants);
						if(status==1)
							System.out.println("Participant registered..");
						else
							System.out.println("couldn't register participants...");
						
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				}
	}
}
}
