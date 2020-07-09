package cn.ztzh.springcloud;

import cn.ztzh.springcloud.dao.UserRepository;
import cn.ztzh.springcloud.model.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }


    @Bean
    ApplicationRunner init(UserRepository userRepository) {
        return args -> {
            User user1 = new User(1L, "account1", "张三", 20, new BigDecimal(100.00));
            User user2 = new User(2L, "account2", "李四", 20, new BigDecimal(233.01));
            User user3 = new User(3L, "account3", "王五", 20, new BigDecimal(180.89));
            User user4 = new User(4L, "account4", "赵柳", 20, new BigDecimal(723.98));
            Stream.of(user1, user2, user3, user4).forEach(userRepository::save);
        };
    }
}
