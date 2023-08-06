package uk.co.sheffieldwebprogrammer.loggingexample.loggingexample.service;

import co.elastic.apm.api.CaptureSpan;
import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class TestService {
    private RestTemplate restTemplate = new RestTemplate();
    @CaptureSpan
    public void test() throws InterruptedException {
        log.info("in test service");
        restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/1", String.class);

        Thread.sleep(100l);
    }
}
