package fr.jju.iamwebproject.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app.IDENTITIES")

public class Identity {
	
	@Id
	@Column(name = "IDEN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="IDENTITYNAME")
	public String identityName;
	
	@Column(name="IDENTITYLASTNAME")
	public String identityLastName;
	
	@Column(name="IDENTITYPHONENUMBER")
	public String identityPhoneNumber;
	
	public Identity(String firstname, String lastname, String phonenumber) {
		identityName = firstname;
		identityLastName = lastname;
		identityPhoneNumber = phonenumber;
	}

}
