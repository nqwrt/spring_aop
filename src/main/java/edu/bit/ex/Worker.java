package edu.bit.ex;

public class Worker {

	private String name;
	private int age;
	private String job;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void getWorkerInfo() {
		System.out.println("�씠由� : " + getName());
		System.out.println("�굹�씠 : " + getAge());
		System.out.println("吏곸뾽 : " + getJob());
	}
	
}
