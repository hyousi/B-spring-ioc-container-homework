package com.thoughtworks.capability.demospringioccontainer;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    @Autowired
    public Foo(Bar bar) {
        this.bar = bar;
    }

    @PostConstruct
    public void init() {
        bar.setFoo(this);
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
