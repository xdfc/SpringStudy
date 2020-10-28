import com.fc.ioc_2.Dogs;
import com.fc.ioc_2.Source;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Source source = (Source) context.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        System.out.println(source.show());

        ApplicationContext sc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dogs dogs = (Dogs)sc.getBean("dogs");
        System.out.println(dogs.info());
    }
}
