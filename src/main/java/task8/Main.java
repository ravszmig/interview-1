package task8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(Main.class, args);
        applicationContext.getBean(MySuperApp.class).run();
    }
}
