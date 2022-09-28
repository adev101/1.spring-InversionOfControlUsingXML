package demoJob;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoJob\\applicationContext.xml");
		
		
		Job companyAJobObj = context.getBean("selected",Job.class);
		
		Job companyBJobObj = context.getBean("rejected",Job.class);
		
		
		
		System.out.println(companyAJobObj.JobStatus());

		System.out.println(companyBJobObj.JobStatus());
			
		context.close();

	}

}
