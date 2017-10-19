package io.cybertech.services.cachingsample.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class HelloMessage implements Serializable {
	private static final long serialVersionUID = 7134147512991544527L;
	private String hello;
	private String name;
	
	@Override
	public String toString() {
		return hello + " " + name + "!";
	}
}
