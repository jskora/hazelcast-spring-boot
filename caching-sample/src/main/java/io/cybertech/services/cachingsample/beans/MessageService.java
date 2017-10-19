package io.cybertech.services.cachingsample.beans;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@Cacheable(cacheNames="spanishNames", key="{#name}")
	public HelloMessage getMessageInSpanish(String name) {
		try {
            TimeUnit.SECONDS.sleep(5);  // (1)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		HelloMessage msg = new HelloMessage();
		msg.setHello("Hola");
		msg.setName(name);
		return msg;
	}
	
	@Cacheable(cacheNames="englishNames", key="{#name}")
	public HelloMessage getMessageInEnglish(String name) {
		try {
            TimeUnit.SECONDS.sleep(5);  // (1)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		HelloMessage msg = new HelloMessage();
		msg.setHello("Hello");
		msg.setName(name);
		return msg;
	}
}
