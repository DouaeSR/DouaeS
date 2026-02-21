package com.bookstore.douaes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "JWT_SECRET=test-secret-please-change-32chars-minimum!!",
        "jwt.secret=test-secret-please-change-32chars-minimum!!"
})
class DouaeSApplicationTests {

    @Test
    void contextLoads() {}
}