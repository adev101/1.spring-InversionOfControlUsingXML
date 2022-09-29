package demoMovie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoMovie\\applicationContext.xml");
		
		Movie objA = context.getBean("topgun", Movie.class);
		
		Movie objB = context.getBean("rambo", Movie.class);
		
		System.out.println(objA.movieCount());
		System.out.println(objB.movieCount());
		
		context.close();

	}

}
