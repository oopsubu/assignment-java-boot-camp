package com.example.week1.product;

import com.example.week1.user.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {

    @MockBean
    private UserRepository userRepository;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("ส่ง productId = 1 แล้วจะต้องได้รับข้อมูล product id = 1")
    void getProductById() {
        ProductResponse response = testRestTemplate.getForObject("/product/1", ProductResponse.class);
        assertEquals(1, response.getId());
    }
}