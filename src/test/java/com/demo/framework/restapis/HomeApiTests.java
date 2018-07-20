package com.demo.framework.restapis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = HomeApiTests.SimpleConfiguration.class)

public class HomeApiTests implements ApplicationContextAware, InitializingBean {

    @Configuration
    public static class SimpleConfiguration {}
    private ApplicationContext applicationContext;
    private boolean beanInitialized = false;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.beanInitialized = true;
    }
    @Override
    public void setApplicationContext(
            final ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void whenTestStarted_thenContextSet() throws Exception {
        TimeUnit.SECONDS.sleep(2);

        System.out.println("++whenTestStarted_thenContextSet");
        assertNotNull(
                "The application context should have been set due to ApplicationContextAware semantics.",
                this.applicationContext);
        System.out.println("--whenTestStarted_thenContextSet");
    }
    @Test
    public void whenTestStarted_thenBeanInitialized() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("++whenTestStarted_thenBeanInitialized");

        assertTrue(
                "This test bean should have been initialized due to InitializingBean semantics.",
                this.beanInitialized);
        System.out.println("++whenTestStarted_thenBeanInitialized");

    }
    @Test
    public void contextLoads() {
    }

}
