package ir.freeland.spring.realworldexampleAnnotation;


import ir.freeland.spring.realworldexampleAnnotation.dao.DaoInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ir.freeland.spring.realworldexampleAnnotation.service.ApplicationService;

public class ApplicationRealworld {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String database = "Oracle"; //Oracle, MySql or MsSql
		
		//Read appContext file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_real_annotation.xml");
		//Get database bean from context.
		DaoInterface dao = context.getBean(database, DaoInterface.class);
		
		//This class is not managed bean. But we can use it in  with other beans  
		ApplicationService app = new ApplicationService(dao);
		
		app.create();
	}

}
