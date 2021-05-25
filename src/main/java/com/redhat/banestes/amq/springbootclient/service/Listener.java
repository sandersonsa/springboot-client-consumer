package com.redhat.banestes.amq.springbootclient.service;

import java.util.Objects;

import javax.jms.Session;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Listener {

    @JmsListener(destination = "${app.springboot.queue}")
	public void consumeMessage(String message, Session session) {
		if(Objects.isNull(session))
            log.info(" # Session: {}", session);
        
        log.info(" ## MESSAGE RECEIVED FROM ACTIVEMQ QUEUE --->> {} ", message);
    }
    
    @JmsListener(destination = "${app.springboot.queue2}")
	public void consumeMessage2(String message, Session session) {
		if(Objects.isNull(session))
            log.info(" # Session: {}", session);
        
        log.info(" ## MESSAGE RECEIVED FROM ACTIVEMQ QUEUE --->> {} ", message);
    }

    @JmsListener(destination = "${app.springboot.queue3}")
	public void consumeMessage3(String message, Session session) {
		if(Objects.isNull(session))
            log.info(" # Session: {}", session);
        
        log.info(" ## MESSAGE RECEIVED FROM ACTIVEMQ QUEUE --->> {} ", message);
    }

    @JmsListener(destination = "${app.springboot.queue4}")
	public void consumeMessage4(String message, Session session) {
		if(Objects.isNull(session))
            log.info(" # Session: {}", session);
        
        log.info(" ## MESSAGE RECEIVED FROM ACTIVEMQ QUEUE --->> {} ", message);
    }

}