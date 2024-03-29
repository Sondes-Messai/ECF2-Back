package fr.idformation.evaluation.core.dto;

public class TypeContactDTO {

	/**
	 * The contact type entity's autogenerated id number.
	 */
	private Short id;

	/**
	 * The contact type entity's label.
	 */
	private String label;

	/**
	 * @return the contact type entity's id
	 */
	public Short getId() {
		return id;
	}

	/**
	 * @param pId the contact type entity's id to set
	 */
	public void setId(final Short pId) {
		this.id = pId;
	}

	/**
	 * @return the contact type entity's label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param pLabel the contact type entity's label to set
	 */
	public void setLabel(final String pLabel) {
		this.label = pLabel;
	}

	/**
	 * The customer entity's default contructor.
	 */
	public TypeContactDTO() {
		super();
	}

}
