package cn.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Application 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonRepository personRepository = annotationConfigApplicationContext.getBean(PersonRepository.class);
        
        Person person = new Person();
        person.setName("我是iemo2");
        person.setAge(21);
        person.setEmail("qq.Eail.com");
        personRepository.insert(person);
        
        
        
    }
}
