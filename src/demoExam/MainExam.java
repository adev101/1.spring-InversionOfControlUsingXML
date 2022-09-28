package demoExam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demoBook.book;

public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoExam\\applicationContext.xml");
		
		//Get the bean from container
		Exam midTermExamObj = context.getBean("midterm", Exam.class); 
		
		
		Exam annualExamObj = context.getBean("annual",Exam.class);
		
		
		
		//call methods on bean
		System.out.println(midTermExamObj.getExamResult());
		System.out.println(annualExamObj
				.getExamResult());
				
		
		
		// close the context
		context.close();
		
		
	}

}
