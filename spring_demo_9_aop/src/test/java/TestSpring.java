import com.jt.config.SpringConfig;
import com.jt.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:48 2021/4/26
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void Test01() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        DeptService deptService = context.getBean(DeptService.class);
        System.out.println(deptService.getClass());
        deptService.addDept();
        deptService.updateDept();
    }
}