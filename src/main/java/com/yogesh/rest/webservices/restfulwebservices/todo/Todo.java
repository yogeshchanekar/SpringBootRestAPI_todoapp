package com.yogesh.rest.webservices.restfulwebservices.todo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity annotation defines that a class can be mapped to a table. 
//And that is it, it is just a marker, like for example Serializable interface.

    @Entity
    public class Todo {
	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String description;
	private Date targetDate;
	private String isCompleted;
	
	public Todo() {
		
	}

	public Todo(long id, String username, String description, Date targetDate, String isCompleted) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isCompleted = isCompleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String isCompleted() {
		return isCompleted;
	}

	public void setDone(String isCompleted) {
		this.isCompleted = isCompleted;
	}

	
	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+(int)(id ^ (id >>> 32));
		return result;
		
 	    }

	        @Override
	        public boolean equals(Object obj) {
		    if (this == obj)
			return true;
		    if (obj == null)
			return false;
		    if (getClass() != obj.getClass())
			return false;
		    Todo other = (Todo) obj;
		    if(id != other.id)
			return false;
	        return true;
	   
	}

}