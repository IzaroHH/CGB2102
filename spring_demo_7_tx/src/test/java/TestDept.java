import com.jt.config.SpringConfig;
import com.jt.proxy.JdkProxyFactory;
import com.jt.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:56 2021/4/25
 * @Modified By:
 */
public class TestDept {

    @Test
    public void testTx() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        DeptService target = (DeptService) context.getBean("deptService");
        DeptService deptService = (DeptService) JdkProxyFactory.getProxy(target);
        deptService.addDept();

    }
}