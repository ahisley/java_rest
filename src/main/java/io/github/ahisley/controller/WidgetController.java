package io.github.ahisley.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ahisley.service.WidgetService;

@RestController
@RequestMapping("/widget")
public class WidgetController {

	@Autowired
	private WidgetService service;
	
	@GetMapping("/count")
	public Long count() {
		
		return service.getWidgetCount();

	}

}
