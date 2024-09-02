package ir.freeland.spring.realworldexampleAnnotation.dao;

import org.springframework.stereotype.Component;

@Component("MsSql")
public class MsSqlApplicationDao implements DaoInterface {

	@Override
	public void add() {
		System.out.println("Data added to MsSql Database .");
		
	}


}
