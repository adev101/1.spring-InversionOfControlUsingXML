package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		//load the spring config file
		// Step 2. Creating the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step 3. retrieve bean from spring container
		book theBook = context.getBean("myBook", book.class); /// this mybook is bean id from xml file
		
		book theNewBook = context.getBean("myDiffBook", book.class); 
		
		//call methods on bean
		System.out.println(theBook.bookName());
		
		System.out.println(theNewBook.bookName());
		
		//close the context
		context.close();
	}

}

//****** Inversion of control process********
// using xml config files is legacy.
// java annotations
// java code


//Steps
// 1. Create a Bean  -- Just a java object. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
// 2. Create a Spring Container
// 3. Retrieve bean from Spring container