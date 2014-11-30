package fr.jju.iamwebproject.derby;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.logging.Log;


@Entity
@Table(name = "ADDRESSES")

public class Address {

	@Id
	@Column(name = "ADDR_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public String number;
	public String street;
	public String city;
	public String country;
	
	public Address(String number, String street, String city, String country) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.street = street;
		this.city = city;
		this.country = country;
		
	}
	
}
