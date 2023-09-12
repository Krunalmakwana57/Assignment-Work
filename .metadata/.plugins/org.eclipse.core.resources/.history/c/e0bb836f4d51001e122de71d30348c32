package SetterINjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("SetterINjection/config.xml");
		User u2 = (User)con.getBean("u2");
		System.out.println(u2.getId());
	}
}
