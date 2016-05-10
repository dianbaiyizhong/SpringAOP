package hhm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		IUser user = (IUser) ctx.getBean("user");
		user.Login("username", "123456");

	}

}
