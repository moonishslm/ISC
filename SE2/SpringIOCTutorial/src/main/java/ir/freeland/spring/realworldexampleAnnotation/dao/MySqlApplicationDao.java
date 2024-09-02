package ir.freeland.spring.realworldexampleAnnotation.dao;

import org.springframework.stereotype.Component;

@Component("MySql")
public class MySqlApplicationDao implements DaoInterface {

	@Override
	public void add() {
		System.out.println("Data added to MySql Database .");
		
	}

}
