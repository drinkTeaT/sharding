package club.tacbin.sharding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingApplicationTests {

    @Test
    void contextLoads() {
        String value = String.format("%s_hello", "abc");
        System.out.println(value);
    }

}
