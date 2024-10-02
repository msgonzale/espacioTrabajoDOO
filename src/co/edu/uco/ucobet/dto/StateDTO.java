package co.edu.uco.ucobet.dto;

import co.edu.uco.crosscutting.helpers.UUIDHelper;

public class StateDTO extend DomainDTO{
	
	private String name;
	private CountryDTO country;
	
	public StateDTO() {
		super(UUIDHelper.getDefaultAsString())
		setName(textHelper.EMPTY);
		
	}
	
	public static final StateDTO create() {
			return new StateDTO();
			
	}
	
	public String getName() {
		return name;
	}
	
	public StateDTO setId(final String id) {
		super.setIdentifier(id);
		return this;
		
	}
	@Override
	public String getId() {
		return super.getId();
	}
	
	public CountryDTO getCountry() {
}

