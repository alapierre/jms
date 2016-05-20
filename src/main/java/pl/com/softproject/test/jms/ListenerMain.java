/**
 * Copyright 2016-05-20 the original author or authors.
 */
package pl.com.softproject.test.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public class ListenerMain {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("listener-context.xml");

    }
}
