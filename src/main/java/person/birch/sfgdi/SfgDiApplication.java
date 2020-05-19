package person.birch.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import person.birch.sfgdi.controllers.ConstructorInjectedController;
import person.birch.sfgdi.controllers.MyController;
import person.birch.sfgdi.controllers.PropertyInjectedController;
import person.birch.sfgdi.controllers.SetterInjectionController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("-------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------- Setter");

        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");

        System.out.println(setterInjectionController.getGreeting());

        System.out.println("-------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
	}

}
