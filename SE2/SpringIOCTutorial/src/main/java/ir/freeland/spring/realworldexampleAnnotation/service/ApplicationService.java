package ir.freeland.spring.realworldexampleAnnotation.service;

import ir.freeland.spring.realworldexampleAnnotation.dao.DaoInterface;

public class ApplicationService implements IApplicationService {
	private DaoInterface database;
	
	public ApplicationService(DaoInterface database) {
		this.database = database;
	}

	@Override
	public void create() {
		System.out.println("New App creating...");
		database.add();	
	}

}
