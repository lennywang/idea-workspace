package com.springboot.thymeleaf;

import com.springboot.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class ThymeleafApplication {

	@RequestMapping("/")
	public String index(Model model){
		Person single=new Person("aa",1);

		List<Person> people=new ArrayList<Person>();
		Person p1=new Person("xx",11);
		Person p2=new Person("yy",11);
		Person p3=new Person("zzzz",11);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);

		System.out.println("person:"+single);
		System.out.println("people:");
		for (Person p: people
			 ) {
			System.out.println(p+"");
		}

		return "index";
	}

	public static void main(String[] args) {
		System.out.println("1");
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
