package org.spring.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yyb
 * @time 2019/3/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource("/application.properties")
public class BaseTest {

    @Configuration
    @ComponentScan(basePackages = {"org.spring.springboot"},
                   excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
    static class ComponentScanConfig {

    }

    @Test
    public void contextLoads() {
    }

}