package com.camunda.consulting.external_task_worker_scheduled_by_process;

public class ExternalTask extends Object {
	private String name;
	private String id;
//	private String url;
	private String tag;
	
	
	public ExternalTask() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
	
}
