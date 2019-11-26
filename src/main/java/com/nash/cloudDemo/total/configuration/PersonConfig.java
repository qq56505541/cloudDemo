package com.nash.cloudDemo.total.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@ConfigurationProperties("person")
@Component
public class PersonConfig {
    private String name;
    
    private String age;
    
    private HashMap map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "PersonConfig{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", map=" + map +
                '}';
    }
}
