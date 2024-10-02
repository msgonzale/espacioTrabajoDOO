package co.edu.uco.ucobet.domain;

import co.edu.uco.crosscutting.helpers.TextHelper;

public class CountryDomain extends Domain{
	
	private String name;
	
	private CountryDomain( final UUID id, final String name) {
		super(id);
		setName(name);
	}
		
	public static final CountryDomain create(final UUID id, final String name) {
		return new CountryDomain(id,name);
	}
	public String getName() {
			return name;
	}
	
	private void setName(final String name) {
		this.name = TextHelper.applyTrim(name);
		
	}
	
	@Override
	public UUID getId() {
		return super.getId();
	}
	
}
