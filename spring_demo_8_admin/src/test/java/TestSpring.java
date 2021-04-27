import com.jt.config.SpringConfig;
import com.jt.proxy.JdkProxyFactory;
import com.jt.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 17:07 2021/4/25
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean("target");
        UserService proxy = (UserService) JdkProxyFactory.getProxy(userService);
        System.out.println(proxy.getClass());
        proxy.addUser();
    }
}
