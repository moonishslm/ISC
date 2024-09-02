package ir.freeland.spring.realworldexampleAnnotation.dao;

import org.springframework.stereotype.Component;

@Component("Oracle")
public class OracleSqlApplicationDao implements DaoInterface {

	@Override
	public void add() {
		System.out.println("Data added to Oracle Database .");
		
	}

}
