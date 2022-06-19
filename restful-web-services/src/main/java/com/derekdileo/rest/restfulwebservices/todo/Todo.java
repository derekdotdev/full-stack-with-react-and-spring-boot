package com.derekdileo.rest.restfulwebservices.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;

}
