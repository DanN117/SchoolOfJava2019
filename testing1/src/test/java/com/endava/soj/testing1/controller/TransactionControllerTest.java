package com.endava.soj.testing1.controller;

import com.endava.soj.testing1.entity.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionControllerTest {

    @MockBean
    private RestTemplate restTemplate;

    @MockBean
    private TransactionController transactionController;

    @Test
    public void testEndpointTest() {
        String url = "http://localhost:8080/test";

        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);

        assertNotNull(responseEntity);
    }
}
