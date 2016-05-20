/**
 * Copyright 2016-05-20 the original author or authors.
 */
package pl.com.softproject.test.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */

@Component
public class MyMessageListener {

    @JmsListener(destination = "q1")
    public void processMessage(String text) {

        System.out.println(text);

    }
}
