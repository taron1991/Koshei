package koschei.models;

import koschei.KoscheiTheDeathless;
import koschei.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless bean = annotationConfigApplicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(bean.getRulesByDeth());
    }
}
