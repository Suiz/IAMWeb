package fr.jju.iamwebproject.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
		this.number = number;
		this.street = street;
		this.city = city;
		this.country = country;
		
	}
	
}
