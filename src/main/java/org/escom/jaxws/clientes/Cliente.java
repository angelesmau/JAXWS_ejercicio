package org.escom.jaxws.clientes;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Cliente {
	private int id;
	private String name;
	private String firstname;
	private String lastname;
	
	public Cliente(){};
	
	
	public Cliente(int id, String name, String firstname, String lastname) {
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
