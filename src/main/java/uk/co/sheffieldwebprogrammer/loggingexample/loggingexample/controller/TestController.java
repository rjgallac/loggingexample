package uk.co.sheffieldwebprogrammer.loggingexample.loggingexample.controller;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import uk.co.sheffieldwebprogrammer.loggingexample.loggingexample.service.TestService;

@RestController
@Slf4j
public class TestController {




    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void testMe() throws InterruptedException {
        log.info("testme");
        testService.test();
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public void testMe2() throws InterruptedException {
        log.info("testme2");
        Thread.sleep(1000L);
    }
}
