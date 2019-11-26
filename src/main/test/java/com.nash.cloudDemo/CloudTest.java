package com.nash.cloudDemo;

import com.nash.cloudDemo.total.configuration.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudTest {
    
    @Autowired
    PersonConfig personConfig;
    
    @Test
    public void test1(){
        System.out.println(personConfig);
    }
}
