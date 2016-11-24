import org.amit.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shape = ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shape.getCircle().getName());
	}

}
