package lk.ijse.project.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${db.name}")
    private String dbName;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OS Name: " + osName);
        System.out.println("DB Name: " + dbName);
    }
}
