import com.jt.config.SpringConfig;
import com.jt.pojo.User;
import com.jt.proxy.JdkProxyFactory;
import com.jt.service.UserService;
import com.jt.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:55 2021/4/25
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void testTX() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        User user = new User();
        user.setId(101);
        user.setName("SpringAOP");
        userService.addUser(user);
    }

    @Test
    public void testProxy() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setId(100001);
        user.setName("SpringProxy");
        userService.addUser(user);
    }

    @Test
    public void testJDKProxy() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService target = (UserService) context.getBean("target");
        UserService userService = (UserService)JdkProxyFactory.getProxy(target);
        System.out.println(userService.getClass());
        User user = new User();
        user.setId(1001);
        user.setName("JDK动态代理完成");
        userService.addUser(user);
        userService.deleteUser(user);
    }

}
