package io.cybertech.services.cachingsample.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.cybertech.services.cachingsample.beans.HelloMessage;
import io.cybertech.services.cachingsample.beans.MessageService;

@RestController
@RequestMapping("/api")
public class SampleRestController {
	@Autowired MessageService messageService;
	
	@RequestMapping("/hi/{name}")
	public HelloMessage helloEnglish(@PathVariable(name="name", required=true) String name) {
		return messageService.getMessageInEnglish(name);
	}
	
	@RequestMapping("/hola/{name}")
	public HelloMessage helloSpanish(@PathVariable(name="name", required=true) String name) {
		return messageService.getMessageInSpanish(name);
	}
}
