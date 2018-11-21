package com.santhosh.SpringBootApp.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.SpringBootApp.beans.HelloBean;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path="/hello")
	public String sayHello() {
		return messageSource.getMessage("good.morning", null, LocaleContextHolder.getLocale());
	}

	@GetMapping(path="/hello-bean")
	public HelloBean sayHelloBean() {
		return new HelloBean(messageSource.getMessage("good.morning", null, LocaleContextHolder.getLocale()));
	}

	@GetMapping(path="/hello-bean/{name}")
	public HelloBean sayHelloBean(@PathVariable String name) {
		return new HelloBean(messageSource.getMessage("good.morning", new String[] {name}, LocaleContextHolder.getLocale()));
	}
}
