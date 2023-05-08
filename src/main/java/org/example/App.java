package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Java java = applicationContext.getBean("java", Java.class);
        System.out.println(java);
        Js js = applicationContext.getBean("js", Js.class);
        System.out.println(js);
        Course course = applicationContext.getBean("course", Course.class);
        course.getProgrammingLanguages().getProgrammingLanguage();
        System.out.println(course);

        applicationContext.close();
    }
}
