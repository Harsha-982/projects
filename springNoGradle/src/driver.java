import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class driver {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        /*Obj*/
        Vehicle vehicle = (Vehicle) beanFactory.getBean("vehicle"); // in case of BeanFactory object is
//      created when need when we use .getBean() method
        vehicle.start();
    }
}