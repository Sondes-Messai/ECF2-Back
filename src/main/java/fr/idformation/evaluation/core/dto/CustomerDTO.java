package fr.idformation.evaluation.core.dto;

import java.util.Set;

public class CustomerDTO {
	/**
	 * The customer DTO's autogenerated id number.
	 */
	private Integer id;

	/**
	 * The customer DTO's first name.
	 */
	private String firstName;

	/**
	 * The customer DTO's last name.
	 */
	private String lastName;

	/**
	 * The customer DTO's adress, usually a number and the street name.
	 */
	private String adress;

	/**
	 * The customer DTO's zip code , usually a 6 figure number.
	 */
	private String zipCode;

	/**
	 * The customer DTO's country.
	 */
	private String country;

	/**
	 * The customer DTO's contact List.
	 */
	private Set<ContactDTO> contactDTOs;

	/**
	 * @return the customer DTO's id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param pId the customer DTO's id to set
	 */
	public void setId(final Integer pId) {
		this.id = pId;
	}

	/**
	 * @return the customer DTO's firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param pFirstName the customer DTO's firstName to set
	 */
	public void setFirstName(final String pFirstName) {
		this.firstName = pFirstName;
	}

	/**
	 * @return the customer DTO's lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param pLastName customer DTO's the lastName to set
	 */
	public void setLastName(final String pLastName) {
		this.lastName = pLastName;
	}

	/**
	 * @return the customer DTO's adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param pAdress customer DTO's the adress to set
	 */
	public void setAdress(final String pAdress) {
		this.adress = pAdress;
	}

	/**
	 * @return the customer DTO's zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param pZipCode the customer DTO's zipCode to set
	 */
	public void setZipCode(final String pZipCode) {
		this.zipCode = pZipCode;
	}

	/**
	 * @return the customer DTO's country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param pCountry the customer DTO's country to set
	 */
	public void setCountry(final String pCountry) {
		this.country = pCountry;
	}

	/**
	 * @return the DTO's contacts
	 */
	public Set<ContactDTO> getContacts() {
		return contactDTOs;
	}

	/**
	 * @param pContactDTOs the contact list to set
	 */
	public void setContacts(final Set<ContactDTO> pContactDTOs) {
		this.contactDTOs = pContactDTOs;
	}

	/**
	 *
	 * @param pContactDTO the contact to be added to the list
	 */
	public void addContact(final ContactDTO pContactDTO) {
		this.contactDTOs.add(pContactDTO);

	}

	/**
	 *
	 * @param pContactDTO the contact to be removed from the list
	 */
	public void removeContact(final ContactDTO pContactDTO) {
		this.contactDTOs.remove(pContactDTO);
	}

	/**
	 * The customer DTO's default contructor.
	 */
	public CustomerDTO() {
		super();
	}

}
