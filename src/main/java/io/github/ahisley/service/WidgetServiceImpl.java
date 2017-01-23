package io.github.ahisley.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.ahisley.repository.WidgetRepository;

//Simple service so I have something to verify Spring config
@Service
public class WidgetServiceImpl implements WidgetService {

	@Autowired
	private WidgetRepository repo;
	
	@Override
	public Long getWidgetCount() {
		// TODO Auto-generated method stub
		return repo.count();
	}

}
