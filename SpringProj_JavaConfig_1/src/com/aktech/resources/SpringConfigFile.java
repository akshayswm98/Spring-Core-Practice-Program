package com.aktech.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.aktech.bean.Student;

@Component
public class SpringConfigFile 
{
	@Bean
	public Student stdId()
	{
		Student std = new Student();
		std.setName("Akshay");
		std.setRollno(103);
		std.setEmail("akshay@gmail.com");
		return std;
	}
}
