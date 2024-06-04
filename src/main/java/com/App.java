package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AuthorBean;
import com.bean.BookBean;
import com.bean.StudentBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//    	StudentBean s1 = new StudentBean();
//    	StudentBean s2 = new StudentBean();
//    	
//    	System.out.println(s1);
//    	System.out.println(s2);

		// ioc container ->
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
		StudentBean s1 = context.getBean("studentBean", StudentBean.class);
		StudentBean s2 = context.getBean("studentBean", StudentBean.class);

		System.out.println(s1);
		System.out.println(s2);

		// DI
			// CI -> constructor injection 

//		AuthorBean author  = new AuthorBean();
//		BookBean book1  = new BookBean(author);
//		//constructor 
//		BookBean book2 = new BookBean(author);
//		
//		System.out.println(book1);
//		System.out.println(book2);

		BookBean book1 = context.getBean("bookBean", BookBean.class);
		BookBean book2 = context.getBean("bookBean", BookBean.class);
		System.out.println(book1);
		System.out.println(book2);
	}
}

//spring -> core -> xml -> code 
//	core bean el context -> same 
//	class -> singleton -> 
//		spring container -> IoC container  -> 
//				1) BeanFactory 
//				2) ApplicationContext(I)
//					ClassPathXmlApplicationContext 
//		1	2	3	4**	5** 
//		spring.xml 

//web -> zero configuration 
