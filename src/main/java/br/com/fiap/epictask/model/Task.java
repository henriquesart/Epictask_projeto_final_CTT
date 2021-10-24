package br.com.fiap.epictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Task {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "{error.task.title}")
	private String title;
	
	@Size(min = 10, message = "{error.task.description}")
	private String description;
	
	@Min(value=10, message = "{error.task.points.min}")
	@Max(value=500, message = "{error.task.points.max}")
	private String points;
	
	@Min(value=0, message = "{error.task.status.min}")
	@Max(value=100, message = "{error.task.status.max}")
	private String status;

}
