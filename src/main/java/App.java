import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld.getMessage());
        System.out.println(beanHelloWorld2.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        System.out.println(beanCat2.getName());
        System.out.println(beanHelloWorld == beanHelloWorld2);
        System.out.println(beanCat == beanCat2);
    }
}