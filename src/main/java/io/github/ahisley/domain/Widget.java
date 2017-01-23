package io.github.ahisley.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="widget")
public class Widget {

	@Id
	private Long id;
	
	@Column(name = "WIDGET_NAME")
	private String widgetName;
}
