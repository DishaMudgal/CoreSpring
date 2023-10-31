package com.springcore.lifecycle;
//IMPLEMENTING BEAN LIFECYCLE USING  XML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class start {

	public static void main(String[] args) {
	AbstractApplicationContext	context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
	context.registerShutdownHook();// BY THIS DETROY METHOD ENABLE;

		Samosa s=(Samosa) context.getBean("samosa1");
		System.out.println(s);
		Example example=(Example) context.getBean("e1");
		System.out.println(example);
	}

}
