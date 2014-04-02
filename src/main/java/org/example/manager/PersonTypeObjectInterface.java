package org.example.manager;

import org.apache.commons.jxpath.JXPathContext;
import org.example.jaxb.domain.AddressType;
import org.example.jaxb.domain.PersonType;

public class PersonTypeObjectInterface {
	
	public String getResidentialAddressState(PersonType person){
		String state = (String)JXPathContext.newContext(person).
		         getValue("residentialAddress/state");
		return state;
	}
	
	public AddressType getAddressByZipcode(PersonType person, String zipCode){
		
			AddressType address = (AddressType)JXPathContext.newContext(person).
			         getValue("/*[zipCode=" + zipCode + "]");
			return address;
	}

}
