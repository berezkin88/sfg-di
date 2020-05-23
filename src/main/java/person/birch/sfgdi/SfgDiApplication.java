package person.birch.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import person.birch.sfgdi.controllers.*;
import person.birch.sfgdi.examplebean.FakeDataSource;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource dataSource = ctx.getBean(FakeDataSource.class);

        System.out.println(dataSource.getUsername());
	}

}
