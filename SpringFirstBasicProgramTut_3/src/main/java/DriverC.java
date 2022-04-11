import com.test.TestC;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DriverC {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("spring.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
/*ObjCreation*/ TestC testC=(TestC) beanFactory.getBean("testC");
// in case of BeanFactory object is created when need when we use .getBean() method
        testC.hello();

        // it will directly look into resources folder
/*ObjCreation*/ ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//      in case of ApplicationContext the object is created when loading spring.xml file only
        TestC testC1=(TestC) applicationContext.getBean("testC");
        testC1.hello();

    }
}
